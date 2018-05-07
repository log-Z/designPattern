package behavioral.chainOfResponsibilityPattern;

import behavioral.chainOfResponsibilityPattern.handler.DoubleHandler;
import behavioral.chainOfResponsibilityPattern.handler.Handler;
import behavioral.chainOfResponsibilityPattern.handler.LongHandler;
import behavioral.chainOfResponsibilityPattern.handler.NonNumberHandler;

/**
 * 设计模式 - 责任链
 *
 * 意图：    使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这些对象连成一条链，并沿着这条链
 *           传递该请求，直到有一个对象处理它为止。
 * 使用案例：层层筛选的处理方式，用尽可能简单（或合适）的方法尽早的处理掉请求。
 * 备注：    在设计中，如果请求被处理，那么处理者既可以终止请求（一般情况），也可以继续往后传递。
 */
public class Cilent {

    public static void main(String[] args) {
        Handler lh = new LongHandler();
        Handler dh = new DoubleHandler();
        Handler nnh = new NonNumberHandler();
        lh.setNext(dh);
        dh.setNext(nnh);

        lh.handlerRequest("123");
        lh.handlerRequest("4.56");
        lh.handlerRequest("78+9");
    }

}
