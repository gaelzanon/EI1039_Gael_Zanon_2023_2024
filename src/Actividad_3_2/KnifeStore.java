package Actividad_3_2;

public abstract class KnifeStore {
    private SimpleKnifeFactory factory;

    public KnifeStore(SimpleKnifeFactory factory) {
        this.factory = factory;
    }

    abstract Knife createKnife(String type);

    public Knife orderKnife(String type) {
        Knife knife = null;

        knife = factory.createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();

        return knife;
    }

}
