package Question6;

import java.util.*;
public class ArrayList12{
   public static void main(String args[]){
      ArrayList<String> alist=new ArrayList<String>(); 
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");

      //displaying elements
      System.out.println(alist);
      
//      search the element 
      int pos1 = alist.indexOf("Tom");
      //displaying elements
        System.out.println(pos1);
      
//     
      int pos = alist.indexOf("Ram");
    //displaying elements
      System.out.println(pos);
   }
}