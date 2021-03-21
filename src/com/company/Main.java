package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {


      /* ArrayListDemo.arrayListDemoCall();

       ArrayListDemo.gerericArrayListDemoCall();

       ArrayListDemo.arrayListIteration();

       ArrayListDemo.arrayListMethods();

       ArrayListDemo.synArrayList();

       ArrayListDemo.threadSafeArraylist();

       ArrayListDemo.removeDuplicateElement();

       ArrayListDemo.arrayListComparison();

        HashMapDemo.HashMapBasics();

        HashMapDemo.HashMapCompare();

        HashMapDemo.HashMapInitialization();

        HashMapDemo.ConcurrentHashMap();

        HashMapDemo.SynchronziedMap();

        HashMapDemo.HashMapToArrayList();

        // Singly Link List example
        SinglyLinkList singlyLinkList = new SinglyLinkList();

        SinglyLinkList.Node firstNode = new SinglyLinkList().new Node(10);
        singlyLinkList.head = firstNode;

        SinglyLinkList.Node secondNode = new SinglyLinkList().new Node(20);
        firstNode.next = secondNode;

        SinglyLinkList.Node thirdNode = new SinglyLinkList().new Node(30);
        secondNode.next = thirdNode;

        singlyLinkList.printSinglyLinkList();*/

        // Tree Map Demo

        TreeMapDemo treeMapDemo = new TreeMapDemo();

        // System.out.println(treeMap.getTreeMap());
        treeMapDemo.printTreeMap();

        // printing key less than 500

        Set<Integer> lessThan500 = treeMapDemo.treeMap.headMap(500).keySet();

        System.out.println(lessThan500);

        // printing key greater than 500 (in this key will be included in condition )

        Set<Integer> greaterThan500 = treeMapDemo.treeMap.tailMap(500).keySet();

        System.out.println(greaterThan500);


    }
}
