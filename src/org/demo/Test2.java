package org.demo;

public class Test2  implements Comparable<Test2>{

    private int intField;
    private String stringField;


    public Test2(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public int compareTo(Test2 anotherTest) {
        if (this.intField == anotherTest.intField) {
            return 0;
        } else if (this.intField < anotherTest.intField) {
            return -1;
        } else {
            return 1;
        }
    }
}
