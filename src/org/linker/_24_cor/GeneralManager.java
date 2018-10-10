package org.linker._24_cor;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(String.format("%s: %s 数量%s 被批准 ", name, request.getRequestContent(), request.getNumer()));
        } else if (request.getRequestType().equals("加薪") && request.getNumer() <= 500) {
            System.out.println(String.format("%s: %s 数量%s 被批准 ", name, request.getRequestContent(), request.getNumer()));
        } else if (request.getRequestType().equals("加薪") && request.getNumer() > 500) {
            System.out.println(String.format("%s: %s 数量%s 再说吧 ", name, request.getRequestContent(), request.getNumer()));
        }
    }
}
