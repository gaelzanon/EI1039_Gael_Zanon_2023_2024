package Actividad_3_2;

public class DemoKnife {
    public static void main(String[] args) {

        KnifeStore usKnifeStore = new USKnifeStore(new SimpleKnifeFactory());
        System.out.println("Comprando en la tienda americana");

        Knife knife1 = usKnifeStore.createKnife("chef");
        System.out.println(knife1.getTienda() + ": " + knife1.getName());
        Knife knife2 = usKnifeStore.createKnife("steak");
        System.out.println(knife2.getTienda() + ": " + knife2.getName());

        KnifeStore europeKnifeStore = new EuropeKnifeStore(new SimpleKnifeFactory());
        System.out.println("Comprando en una tienda europea");

        Knife knife3 = europeKnifeStore.createKnife("chef");
        System.out.println(knife3.getTienda() + ": " + knife3.getName());
        Knife knife4 = europeKnifeStore.createKnife("steak");
        System.out.println(knife4.getTienda() + ": " + knife4.getName());
    }
}
