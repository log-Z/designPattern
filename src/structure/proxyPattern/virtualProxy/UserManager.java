package structure.proxyPattern.virtualProxy;

import structure.proxyPattern.virtualProxy.db.Database;
import structure.proxyPattern.virtualProxy.db.ResultSet;

import java.util.ArrayList;
import java.util.Collection;

public class UserManager {

    public Collection<UserModelApi> getUserById(String id) {
        Collection<UserModelApi> col = new ArrayList<>();
        ResultSet resultSet = Database.queryByEquals(Database.COLUMN_ID, id);

        do {
            Proxy proxy = new Proxy(new UserModel());
            proxy.setId(resultSet.getData(Database.COLUMN_ID));
            proxy.setName(resultSet.getData(Database.COLUMN_NAME));
            col.add(proxy);
        } while (resultSet.next());

        return col;
    }

}
