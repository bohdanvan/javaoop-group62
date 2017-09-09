package com.bvan.oop.lessons1_2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p = new ProcPerson();
        p.name = "Taras";
        p.age = 25;

        String message = buildHelloMessage(p);

        System.out.println(message);
    }

    private static String buildHelloMessage(ProcPerson p) {
        return "Hello, I'm " + p.name + ", " + p.age + " years old";
    }
}
