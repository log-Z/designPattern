package behavioral.chainOfResponsibilityPattern.handler;

public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handlerRequest(String request) {
        if (!handler(request) && next != null) {
            next.handlerRequest(request);
        }
    }

    protected abstract boolean handler(String request);

}
