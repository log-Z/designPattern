package behavioral.interpreterPattern;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

public class ElementExpression implements ReadXmlExpression {

    private Collection<ReadXmlExpression> eles = new ArrayList<>();
    private String eleName;

    ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    boolean addEle(ReadXmlExpression ele) {
        return eles.add(ele);
    }

    boolean removeEle(ReadXmlExpression ele) {
        return eles.remove(ele);
    }

    @Override
    public String[] interpret(Context context) {
        var pEles = context.getPreEles();
        var nowEles = new ArrayList<Element>();

        if (pEles.isEmpty()) {
            var ele = context.getDocument().getDocumentElement();
            pEles.add(ele);
            context.setPreEles(pEles);
        } else {
            for (var tempEle : pEles) {
                nowEles.addAll(context.getNowEles(tempEle, eleName));
                if (!nowEles.isEmpty()) {
                    break;
                }
            }

            var tempList = new ArrayList<Element>();
            tempList.add(nowEles.get(0));
            context.setPreEles(tempList);
        }

        String[] ss = null;
        for (var trmpEle : eles) {
            ss = trmpEle.interpret(context);
        }

        return ss;
    }

}
