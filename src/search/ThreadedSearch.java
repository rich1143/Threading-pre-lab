package search;

import java.util.ArrayList;

public class ThreadedSearch<T> {
    
    private T storedTarget;
    private ArrayList<T> storedList;
    private int storedStart;
    private int storedEnd;
    private Answer storedAnswer;
    
    public ThreadedSearch() {
    }
    
    private ThreadedSearch(T target, ArrayList<T> list, int start, int end, Answer answer) {
        storedTarget=target;
        storedList=list; 
        storedStart=start;
        storedEnd=end;
        storedAnswer=answer;
    }
    
    // Assume list size is divisible by numThreads to start
    public boolean parSearch(int numThreads, T target, ArrayList<T> list) {
        return false;
    }
    
    private void search(T target, ArrayList<T> list, int start, int end) {
        
    }
    
    private class Answer {
        public boolean answer=false;
    }

}
