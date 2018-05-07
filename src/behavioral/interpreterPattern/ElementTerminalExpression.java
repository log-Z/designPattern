package behavioral.interpreterPattern;

import org.w3c.dom.Element;

public class ElementTerminalExpression implements ReadXmlExpression {

    private String eleName;

    ElementTerminalExpression(String name) {
        eleName = name;
    }

    @Override
    public String[] interpret(Context context) {
        var pEles = context.getPreEles();
        Element ele;

        if (pEles.isEmpty()) {
            ele = context.getDocument().getDocumentElement();
        } else {
            ele  = context.getNowEles(pEles.get(0), eleName).get(0);
        }

        var ss = new String[1];
        ss[0] =  "<" + ele.getTagName() + " ... >";
        return ss;
    }

}
