package org.example;

public interface TestInterface {
    int MAX_VALUE = 500;

    void concreteMethod();
    void abstractMethod();
    int getTest();
    void setTest(int test);

    default void interfaceMethod() {
        System.out.println("Default-метод интерфейса. " + MAX_VALUE);
        lA("Вызов default-метода");
    }

    static void staticInterfaceMethod() {
        System.out.println("Статический метод интерфейса.");
    }

    private void lA(String action) {
        System.out.println("INTERFACE " + action);
    }
}
