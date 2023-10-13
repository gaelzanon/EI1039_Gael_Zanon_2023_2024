package Actividad_3_1;

public class DemoSingleton {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        Singleton instance1 = Singleton.getInstance();
        long t2 = System.currentTimeMillis();
        System.out.println(instance1);

        System.out.println("Duración de creación objeto singleton (ms): " + (t2 - t1) );

        t1 = System.currentTimeMillis();
        Singleton instance2 = Singleton.getInstance();
        t2 = System.currentTimeMillis();

        System.out.println(instance2);
        System.out.println("Duración llamada a objeto singleton (ms): " + (t2 - t1) );
    }
}
