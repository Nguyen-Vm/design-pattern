package org.linker._13_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n 产品 创建 ----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
