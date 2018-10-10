package org.linker._18_menento;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.initState();
        System.out.println(role);

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());

        role.fight();
        System.out.println(role);

        role.recoveryState(caretaker.getMemento());
        System.out.println(role);
    }
}
