package org.linker._02_strategy;

/**
 * @author RWM
 * @date 2018/6/1
 */
public class Client {

    public static void main(String[] args) {
        Player player = new Player();
        player.buy(1000D);
        System.out.println("玩家需要付钱： " + player.calLastAmount());
        player.buy(1000D);
        System.out.println("玩家需要付钱： " + player.calLastAmount());
        player.buy(1000D);
        System.out.println("玩家需要付钱： " + player.calLastAmount());
        player.buy(1000D);
        System.out.println("玩家需要付钱： " + player.calLastAmount());
    }
}
