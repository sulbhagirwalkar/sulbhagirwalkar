package com.DSAExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(41);
        myList.add(89);
        myList.add(21);
        myList.add(88);
      //  System.out.println(myList);
        System.out.println(myList.getFirst());
        System.out.println(myList.size());
        Iterator itr = myList.iterator();
        while(itr.hasNext()){
            if((int)itr.next()== 88){
                System.out.println("we found 88");
            }
        }

    }

}
