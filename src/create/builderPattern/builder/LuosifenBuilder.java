package create.builderPattern.builder;

public class LuosifenBuilder extends NoodlesBuilder {

    @Override
    public void createNewNoodles() {
        super.createNewNoodles();
        mNoodles.name = "螺蛳粉";
    }

    @Override
    public void buildNoodleShape() {
        mNoodles.noodleShape = "圆";
    }

    @Override
    public void buildNoodleWidth() {
        mNoodles.noodleWidth = 300;
    }

    @Override
    public void buildIngredients() {
        mNoodles.ingredients = "炸腐竹、酸笋、青菜和螺丝";
    }

}
