package org.demo;


public class DemoMap {
    public static void main(String[] args) {
        System.out.println("Task 1 -> ");
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.getHashMapDemo();

        System.out.println("Task 3 -> ");
        LinkedHashMapDemo linkedHashMapDemo = new LinkedHashMapDemo();
        linkedHashMapDemo.getLinkedHashMapDemo();

        System.out.println("Task 2 -> ");
        TestDemo testDemo = new TestDemo();
        testDemo.getHashMap();

        System.out.println("Task 4 -> ");
        Test2Demo test2Demo = new Test2Demo();
        test2Demo.getTreeMapWithComparable();


    }
}
