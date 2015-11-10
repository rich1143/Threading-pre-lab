# Overview of Threads

The next lab is all about threads. To prepare, we are asking you to make a threaded version of search. You'll download some code to start with - a non-threaded search - and stubs for threaded search. The starter code can be found in the included subdirectory of this repository.  You might find [this tutorial](http://www.tutorialspoint.com/java/java_multithreading.htm) to be helpful (be sure to go through the 4 additional tutorials at the bottom of that last tutorial before proceeding)

Your threads will need to share state in an array as well as having local variables that capture the locations in the array that this thread is responsible for searching.

One tool that you'll need is the `join()` method. (See, for example, http://docs.oracle.com/javase/tutorial/essential/concurrency/join.html). `join()` allows one thread to wait for another to finish, which is important in searching because we need all the sub-threads to finish searching their part of the array before we can combine their answers and determine the final result. A common pattern is something like the following:

```{java}
// Create and start a bunch of threads
   Thread[] threads = new Thread[NUM_THREADS];
   for (int i=0; i<NUM_THREADS; ++i) {
      // Create and start thread i
      threads[i] = new Thread(...);
      threads[i].start();
   }

   // Wait for all the threads to finish
   for (int i=0; i<NUM_THREADS; ++i) {
      threads[i].join();
   }

   // Combine their results and wrap up as appropriate to the problem.
   ```
   
This assumes that the various threads have saved their partial results to some shared state object that this main thread can access to assemble the final result.

It's important to realize that `join()` blocks, causing the main thread to wait until the thread being joined finishes. This means that if we had called `join()` in the first loop we would have lost all our parallelism because we would have waited for the first thread to finish before starting the second thread, etc.
