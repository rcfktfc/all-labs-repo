package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Test1 obj = new Test1(42);

        obj.concreteMethod();
        obj.abstractMethod();
        obj.finalMethod();
        obj.ownMethod();

        obj.interfaceMethod();

        System.out.println(obj.getTest());
        obj.setTest(100);
        System.out.println(obj.getTest());

        System.out.println("-----------------------------------");

        Test oObj = new Test1(99);
        oObj.concreteMethod();
        oObj.abstractMethod();

        System.out.println("-----------------------------------");

        TestInterface interfaceObj = new Test1(200);
        interfaceObj.concreteMethod();
        interfaceObj.abstractMethod();
        interfaceObj.interfaceMethod();
    }

}

