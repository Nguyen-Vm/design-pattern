package org.linker._24_cor;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Major extends Manager {

    public Major(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumer() <= 5) {
            System.out.println(String.format("%s: %s 数量%s 被批准 ", name, request.getRequestContent(), request.getNumer()));
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
