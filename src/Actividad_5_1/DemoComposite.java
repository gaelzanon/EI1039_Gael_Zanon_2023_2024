package Actividad_5_1;

public class DemoComposite {

    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");
        Composite paquete = new Composite();


        Composite paqueteCliente1 = new Composite();

        Te te0 = new Te("Te Blanco", 60);
        System.out.println("Añado una caja de " + te0.getTipo());
        paqueteCliente1.add(te0);

        Te te1 = new Te("Te Blanco", 60);
        System.out.println("Añado una caja de " + te1.getTipo());
        paqueteCliente1.add(te1);

        Te te2 = new Te("Te Verde", 24);
        System.out.println("Añado una caja de " + te2.getTipo());
        paqueteCliente1.add(te2);


        Composite paqueteCliente2 = new Composite();

        Te te3 = new Te("Te Verde", 24);
        System.out.println("Añado una caja de " + te3.getTipo());
        paqueteCliente2.add(te3);

        Te te4 = new Te("Te Verde", 24);
        System.out.println("Añado una caja de " + te4.getTipo());
        paqueteCliente2.add(te4);

        Te te5 = new Te("Te Blanco", 60);
        System.out.println("Añado una caja de " + te5.getTipo());
        paqueteCliente2.add(te5);


        int totalCliente1 = paqueteCliente1.contar();
        System.out.println("Este paquete consta de " + totalCliente1 + " unidades");


        int totalCliente2 = paqueteCliente2.contar();
        System.out.println("Este paquete consta de " + totalCliente2 + " unidades");


        paquete.add(paqueteCliente1);
        paquete.add(paqueteCliente2);
        int total = paquete.contar();
        System.out.println("Este paquete consta de " + total + " unidades");


        System.out.println("El envío a Asia contiene " + total + " unidades de té");
    }
}
