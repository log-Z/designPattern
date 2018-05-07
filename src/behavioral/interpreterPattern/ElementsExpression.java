package behavioral.interpreterPattern;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

public class ElementsExpression implements ReadXmlExpression {

    private Collection<ReadXmlExpression> eles = new ArrayList<>();
    private String eleName;

    ElementsExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context context) {
        var pEles = context.getPreEles();
        var nowEles = new ArrayList<Element>();

        for (var ele : pEles) {
            nowEles.addAll(context.getNowEles(ele, eleName));
        }
        context.setPreEles(nowEles);

        String[] ss = null;
        for (var ele : eles) {
            ss = ele.interpret(context);
        }

        return ss;
    }

    boolean addEle(ReadXmlExpression ele) {
        return eles.add(ele);
    }

    boolean removeEle(ReadXmlExpression ele) {
        return eles.remove(ele);
    }

}
