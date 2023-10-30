package Actividad_5_2;

public class BaseDecorator {
    Caja caja;

    public BaseDecorator(Caja caja) {
        this.caja = caja;
    }

    private int contar() {
        return caja.contar();
    }
}
