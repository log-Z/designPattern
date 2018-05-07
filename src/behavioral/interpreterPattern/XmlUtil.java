package behavioral.interpreterPattern;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;

public class XmlUtil {

    static Document getRoot(String filePathName) throws Exception {
        var factory = DocumentBuilderFactory.newInstance();
        var builder = factory.newDocumentBuilder();
        var doc = builder.parse(filePathName);

        doc.normalize();
        return doc;
    }

}
