package it.develhope.incapsulamento02;

public class Start {
    public static void main(String ...args) {
        Person p = new Person();
        p.setName("Sofia");
        p.setSurname("Rossi");
        p.setHeight(1.70);
        p.setAge(24);


        System.out.println(p);
    }
}
