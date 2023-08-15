package com.study.collections;

public class manualLinkedList {
    public static void main(String[] args) {

        Node apple = new Node("Apple");
        Node banana = new Node("Banana");
        Node camel = new Node("Camel");
        apple.next = banana;
        banana.next=camel;
        camel.pre = banana;
        banana.pre=apple;

        Node first = apple;
        Node last = camel;

        // let us loop through



        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("now backeards");

        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        // let us add something

        Node dove = new Node("Dove");

        banana.next = dove;
        dove.next=camel;
        camel.pre=dove;
        dove.pre=banana;
        first = apple;
        last = camel;

        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("now backeards");

        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }




    }
}

class Node {
    public Object name;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node " + name;
    }
}