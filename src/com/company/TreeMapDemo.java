package com.company;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

    TreeMap<Integer,String > treeMap = new TreeMap<Integer,String>();

    // For reverse one
    TreeMap<Integer,String > treeMapReverse = new TreeMap<Integer,String>(Comparator.reverseOrder());

    public TreeMapDemo(){

        // Ascending   order
        treeMap.put(100,"Meghraj");
        treeMap.put(500,"Megh");
        treeMap.put(600,"Raju");
        treeMap.put(250,"Pinki");
        treeMap.put(151,"Vinod");

        // for reverse order
        treeMapReverse.put(100,"Meghraj");
        treeMapReverse.put(500,"Megh");
        treeMapReverse.put(600,"Raju");
        treeMapReverse.put(250,"Pinki");
        treeMapReverse.put(151,"Vinod");


    }



    public void printTreeMap() {

        treeMap.forEach((k,v) -> System.out.println("Key is :" + k + "Value is :" +v));
    }

    public void printReverseTreeMap() {

        treeMapReverse.forEach((k,v) -> System.out.println("Key is :" + k + "Value is :" +v));
    }
}
