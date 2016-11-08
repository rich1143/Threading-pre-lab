package search;

import java.util.ArrayList;

public class Main {
    
   public static void main(String[] args){
       Random random = new Random();
       ArrayList<Integer> list1=new ArrayList<Integer>();
       for (int i=0; i<10000; ++i) {
           list1.add(random.nextInt(10000);
       }
       System.out.println(searchArray(list1.get(1), list1));
       System.out.println(searchArray(list1.get(5), list1));
       System.out.println(searchArray(list1.get(900), list1));       
       System.out.println(searchArray(list1.get(3200), list1));
       System.out.println(searchArray(list1.get(7400), list1));
       System.out.println(searchArray(list1.get(9876), list1));
       System.out.println(searchArray(2000000, list1));
       System.out.println(searchArray(-45, list1));
   }
   
   private static boolean searchArray(int target, ArrayList<Integer> list){
       ThreadedSearch<Integer> searcher=new ThreadedSearch<Integer>();
       // This specifies 4 threads for the tests. It would be a good idea to play
       // with this and see how that changes things. Keep in mind that your number
       // of threads *may* need to evenly divide the length of the list being
       // searched (10,000 in this case).
       return searcher.parSearch(4, target, list);
   }

}
