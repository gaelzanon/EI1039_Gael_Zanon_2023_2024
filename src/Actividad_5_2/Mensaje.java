package Actividad_5_2;

public class Mensaje extends BaseDecorator {

    public Mensaje(Caja caja) {
        super(caja);
    }

    public int contar() {
        int cantidad = caja.contar();
        extra(cantidad);
        return cantidad;
    }

    private void extra(int cantidad) {
        System.out.println("Enviado mensaje al cliente: Pedido de " + cantidad + " unidades");
    }
}
