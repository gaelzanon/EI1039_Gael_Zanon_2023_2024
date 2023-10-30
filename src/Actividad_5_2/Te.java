package Actividad_5_2;

public class Te implements Caja {

    private String tipo;
    private int cantidad;

    public Te(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int contar() {
        return cantidad;
    }
}
