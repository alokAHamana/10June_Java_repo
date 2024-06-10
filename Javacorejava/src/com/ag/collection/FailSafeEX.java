package com.ag.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeEX {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 50) {       //      agar hame value 5 mile jaye to hm 
                al.remove(2);            //    index[2] ki value 3 remove kr dengye
            }
        }

        System.out.println(al);
    }
}                                  //   o/p = [10, 20, 40, 50]
