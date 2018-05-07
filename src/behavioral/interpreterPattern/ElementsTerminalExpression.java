package behavioral.interpreterPattern;

import org.w3c.dom.Element;

import java.util.ArrayList;

public class ElementsTerminalExpression implements ReadXmlExpression {

    private String eleName;

    ElementsTerminalExpression(String name) {
        eleName = name;
    }

    @Override
    public String[] interpret(Context context) {
        var pEles = context.getPreEles();
        var nowEles = new ArrayList<Element>();

        for (var ele : pEles) {
            nowEles.addAll(context.getNowEles(ele, eleName));
        }

        var ss = new String[nowEles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = "<" + nowEles.get(i).getTagName() + " ... >";
        }

        return ss;
    }

}
