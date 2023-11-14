package Actividad_6_2;

public class DemoTemplateMethod {
    public static void main(String[] args) {
        Satelite satelite = new Satelite();
        System.out.println("Clasificando un satélite");
        satelite.templateMethod();
        System.out.println("\n");
        Spam spam = new Spam();
        System.out.println("Clasificando spam");
        spam.templateMethod();
    }
}
