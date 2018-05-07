package behavioral.chainOfResponsibilityPattern.handler;

public class NonNumberHandler extends Handler {

    @Override
    protected boolean handler(String request) {
        System.out.println("this request is non number, value is \"" + request + "\"");
        return true;
    }

}
