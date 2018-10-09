package org.linker._15_abstract_factory.simple_factory;

import org.linker._15_abstract_factory.AccessDepartment;
import org.linker._15_abstract_factory.AccessUser;
import org.linker._15_abstract_factory.IDepartment;
import org.linker._15_abstract_factory.IUser;
import org.linker._15_abstract_factory.SqlserverDepartment;
import org.linker._15_abstract_factory.SqlserverUser;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class DataAccess {

    private static final String db = "SQL Server";
    //private static final String db = "Access";

    public static IUser createUser() {
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

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "SQL Server":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }

}
