package com.company;

public class Main {

    public static void main(String[] args) {


     /*  ArrayListDemo.arrayListDemoCall();

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

        HashMapDemo.HashMapToArrayList();*/

        // Singly Link List example
        SinglyLinkList singlyLinkList = new SinglyLinkList();

        SinglyLinkList.Node firstNode = new SinglyLinkList().new Node(10);
        singlyLinkList.head = firstNode;

        SinglyLinkList.Node secondNode = new SinglyLinkList().new Node(20);
        firstNode.next = secondNode;

        SinglyLinkList.Node thirdNode = new SinglyLinkList().new Node(30);
        secondNode.next = thirdNode;

        singlyLinkList.printSinglyLinkList();

    }
}
