package org.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public void getLinkedHashMapDemo() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "sssx");
        map.put(3, "sffd");
        map.put(7, "aasedsx");
        map.put(4, "sxgfd");
        map.put(5, "sgcrvx");
        map.put(6, "fwecx");
        map.put(2, "vsxvcs");
        map.put(8, "s23x");
        map.put(9, "hrt sx");
        map.put(10, "23sx");
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
    }
}
