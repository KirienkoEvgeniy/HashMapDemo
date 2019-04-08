package org.demo;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public void getHashMap(){
        Test test = new Test(1, "evew");
        Test test1 = new Test(4, "wexwefdw");
        Test test2 = new Test(5, "defrghy");
        Test test3 = new Test(7, "lkjh");
        Test test4 = new Test(3, "ujmn6");
        Map<Integer, String> mapTest = new HashMap<>();

        mapTest.put(test.getIntField(),test.getStringField());
        mapTest.put(test1.getIntField(),test1.getStringField());
        mapTest.put(test2.getIntField(),test2.getStringField());
        mapTest.put(test3.getIntField(),test3.getStringField());
        mapTest.put(test4.getIntField(),test4.getStringField());
        System.out.println(mapTest.entrySet());
        for (Integer key : mapTest.keySet()) {
            System.out.println(key + " -> " + mapTest.get(key));
        }
    }
}
