package behavioral.interpreterPattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Context {

    private Document document;
    private List<Element> preEles = new ArrayList<>();

    Context(String filePathName) throws Exception {
        document = XmlUtil.getRoot(filePathName);
    }

    void reInit() {
        preEles.clear();
    }

    List<Element> getNowEles(Element parent, String eleName) {
        var elements = new ArrayList<Element>();
        var tempNodeList  = parent.getChildNodes();

        for (var i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                var nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    elements.add(nowEle);
                }
            }
        }

        return elements;
    }

    Document getDocument() {
        return document;
    }

    List<Element> getPreEles() {
        return preEles;
    }

    void setPreEles(List<Element> nowEles) {
        preEles = nowEles;
    }

}
