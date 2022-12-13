package com.company.designpattern.behavior.cor;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        CommonManager jingli = new CommonManager("经理");
        Major zongjian = new Major("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();

        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumer(1);
        jingli.requestApplications(request);

        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumer(4);
        jingli.requestApplications(request);

        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumer(500);
        jingli.requestApplications(request);

        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumer(1000);
        jingli.requestApplications(request);
    }
}
