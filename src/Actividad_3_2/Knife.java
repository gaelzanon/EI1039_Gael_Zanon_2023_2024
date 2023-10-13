package Actividad_3_2;

public abstract class Knife {
    String name;
    String tienda;

    public void sharpen() {
        System.out.println("sharpen");
    }

    public void polish() {
        System.out.println("polish");
    }

    public void wrapp() {
        System.out.println("wrapp");
    }

    public String getName() {
        return name;
    }

    public String getTienda() {
        return tienda;
    }
}
