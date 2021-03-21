package com.company;

import java.util.TreeMap;

public class TreeMapDemo {

    TreeMap<Integer,String > treeMap = new TreeMap<Integer,String>();

    public TreeMapDemo(){

        treeMap.put(100,"Meghraj");
        treeMap.put(500,"Megh");
        treeMap.put(600,"Raju");
        treeMap.put(250,"Pinki");
        treeMap.put(151,"Vinod");

    }

    public void printTreeMap() {

        treeMap.forEach((k,v) -> System.out.println("Key is :" + k + "Value is :" +v));
    }
}
