package behavioral.interpreterPattern;

public class Client {

    /**
     * 设计模式 - 解释器
     *
     * 意图：    给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
     * 使用案例：jQuery的选择器，计算器。
     * 备注：    一般的，解释器模式与组合模式一起使用，主要用于解释树形结构的组合。
     */
    public static void main(String[] args) throws Exception {
        var context = new Context("test.xml");

        var root = new ElementExpression("root");
        var userEle = new ElementsExpression("user");
        var namePro = new PropertysTerminalExpression("name");

        root.addEle(userEle);
        userEle.addEle(namePro);

        var ss = root.interpret(context);
        for (var s : ss) {
            System.out.println(s);
        }
    }

}
