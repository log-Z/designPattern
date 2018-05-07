package create.builderPattern;

import create.builderPattern.builder.NoodlesBuilder;

public class Waiter {

    private NoodlesBuilder mNoodlesBuilder;

    public void setNoodlesBuilder(NoodlesBuilder builder) {
        mNoodlesBuilder = builder;
    }

    public Noodles getNoodles() {
        return mNoodlesBuilder.getNoodles();
    }

    public boolean constructNoodles() {
        if (mNoodlesBuilder == null) {
            return false;
        }
        mNoodlesBuilder.createNewNoodles();
        mNoodlesBuilder.buildNoodleShape();
        mNoodlesBuilder.buildNoodleWidth();
        mNoodlesBuilder.buildIngredients();
        return true;
    }

}
