package assignment4;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("BankAccount");
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
