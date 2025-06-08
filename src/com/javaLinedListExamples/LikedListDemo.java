package com.javaLinedListExamples;

import java.util.LinkedList;

public class LikedListDemo {
    public static void main(String[] args) {
        // create a linked list
        LinkedList<String> ll = new LinkedList<>();

       // add element to the linkedlist

        ll.add("Sulbha");
        ll.add("Ana");
        ll.add("Sanya");
        ll.add("Sanya");
        ll.add("Rekha");
        ll.addFirst("Ali");
        ll.addLast("Zia");
        System.out.println(ll);

        ll.remove(2);
        //ll.remove("Sanya");
        ll.removeFirst();
        ll.removeLast();
        ll.removeFirstOccurrence("Sanya");
        System.out.println(ll);

    }
}
