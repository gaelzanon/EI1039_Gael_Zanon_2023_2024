package Actividad_3_2;

public class SimpleKnifeFactory {

    public static Knife createKnife(String type) {
        Knife knife = null;

        if (type.equals("chef")) {
            knife =  new ChefKnife();
        } else if (type.equals("steak")) {
            knife = new SteakKnife();
        }

        return knife;
    }
}
