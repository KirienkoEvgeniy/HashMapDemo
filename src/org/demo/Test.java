package org.demo;

public class Test {

       private int intField;
       private String stringField;

    public Test(int intField, String stringField) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return intField == test.intField;

    }

    @Override
    public int hashCode() {
        return intField;
    }
}

