package com.company;

public  class SinglyLinkList {

    Node head;
    public class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }


    }
    public void printSinglyLinkList(){
        Node n = head;

        while (n != null) {

            System.out.println(n.data);
            n = n.next;

        }

    }
}
