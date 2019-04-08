package org.demo;

import java.util.Map;
import java.util.TreeMap;

public class Test2Demo {
    public void getTreeMapWithComparable(){
        Test2 test32 = new Test2(12, "wqs");
        Test2 test21 = new Test2(121, "wxsaqs");
        Test2 test22 = new Test2(65, "5t45cvywqs");
        Test2 test25 = new Test2(36, "ehfgfergth");
        Test2 test12 = new Test2(936, "wqfhetgs");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(test32.getIntField(), test32.getStringField());
        treeMap.put(test21.getIntField(), test21.getStringField());
        treeMap.put(test22.getIntField(), test22.getStringField());
        treeMap.put(test25.getIntField(), test25.getStringField());
        treeMap.put(test12.getIntField(), test12.getStringField());
        System.out.println(treeMap.entrySet());
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " -> " + treeMap.get(key));
        }
    }
}
