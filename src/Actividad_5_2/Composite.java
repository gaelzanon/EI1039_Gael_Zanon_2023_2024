package Actividad_5_2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Caja {
    private List<Caja> children;

    public Composite() {
        this.children = new ArrayList<>();
    }

    public void add(Caja c) {
        this.children.add(c);
    }

    @Override
    public int contar() {
        int total = 0;
        for (Caja c: children) {
            total += c.contar();
        }
        return total;
    }
}
