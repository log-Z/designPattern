package create.builderPattern.builder;

public class LaoyouRiceNoodlesBuilder extends NoodlesBuilder {

    @Override
    public void createNewNoodles() {
        super.createNewNoodles();
        mNoodles.name = "老友粉";
    }

    @Override
    public void buildNoodleShape() {
        mNoodles.noodleShape = "宽扁";
    }

    @Override
    public void buildNoodleWidth() {
        mNoodles.noodleWidth = 1000;
    }

    @Override
    public void buildIngredients() {
        mNoodles.ingredients = "番茄、酸笋、青菜和猪肉片";
    }

}
