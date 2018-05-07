package behavioral.interpreterPattern;

public class PropertysTerminalExpression implements ReadXmlExpression {

    private String propName;

    PropertysTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context context) {
        var eles = context.getPreEles();
        var ss = new String[eles.size()];

        for (var i = 0; i < ss.length; i++) {
            ss[i] = eles.get(i).getAttribute(propName);
        }

        return ss;
    }

}
