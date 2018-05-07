package behavioral.chainOfResponsibilityPattern.handler;

public class LongHandler extends Handler {

    @Override
    protected boolean handler(String request) {
        try {
            long l = Long.valueOf(request);
            System.out.println("number type is long, value is " + l);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
