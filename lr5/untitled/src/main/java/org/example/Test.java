package org.example;

public abstract class Test implements TestInterface{
    private int test;
    public static int counter = 0;

    @Override
    public int getTest() {
        return this.test;
    }

    @Override
    public void setTest(int test) {
        if (test <= MAX_VALUE) {
            this.test = test;
        } else {
            System.out.println("Превышено MAX_VALUE значение " + MAX_VALUE);
        }
    }

    public Test(int test) {
        this.test = test;
    }

    @Override
    public abstract void abstractMethod();

    @Override
    public void concreteMethod() {
        System.out.println("concreteMethod() Test. test= " + test);
    }

    public final void finalMethod() {
        System.out.println("finalMethod()");
    }

    public static void staticMethod() {
        System.out.println("staticMethod() counter = " + counter);
    }


}
