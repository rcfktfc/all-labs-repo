package org.example;

public class Test1 extends Test {

    public Test1(int test) {
        super(test);
    }

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod() в Test1");
    }

    public void ownMethod() {
        System.out.println("Собственный метод класса Test1");
        finalMethod();
    }
}
