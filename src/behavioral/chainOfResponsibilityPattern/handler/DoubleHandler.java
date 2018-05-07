package behavioral.chainOfResponsibilityPattern.handler;

public class DoubleHandler extends Handler {

    @Override
    protected boolean handler(String request) {
        try {
            double d = Double.valueOf(request);
            System.out.println("number type is double, value is " + d);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
