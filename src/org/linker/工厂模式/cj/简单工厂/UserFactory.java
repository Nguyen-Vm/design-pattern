package org.linker.工厂模式.cj.简单工厂;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class UserFactory {

    public static IUser createUser(String db) {
        IUser result = null;
        switch (db) {
            case "SQL Server":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }
}
