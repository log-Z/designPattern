package create.builderPattern.builder;

import create.builderPattern.Noodles;

public abstract class NoodlesBuilder {

    Noodles mNoodles;

    public void createNewNoodles() {
        mNoodles = new Noodles();
    }

    public Noodles getNoodles() {
        return mNoodles;
    }

    public abstract void buildNoodleShape();

    public abstract void buildNoodleWidth();

    public abstract void buildIngredients();

}
