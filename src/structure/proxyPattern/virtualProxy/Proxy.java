package structure.proxyPattern.virtualProxy;

import structure.proxyPattern.virtualProxy.db.Database;
import structure.proxyPattern.virtualProxy.db.ResultSet;

public class Proxy implements UserModelApi {

    private UserModel userModel;
    private boolean loaded = false;

    Proxy(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public String getId() {
        return userModel.getId();
    }

    @Override
    public void setId(String id) {
        userModel.setId(id);
    }

    @Override
    public String getName() {
        return userModel.getName();
    }

    @Override
    public void setName(String name) {
        userModel.setName(name);
    }

    @Override
    public String getSex() {
        if (!loaded) {
            reload();
            loaded = true;
        }
        return userModel.getSex();
    }

    @Override
    public void setSex(String sex) {
        userModel.setSex(sex);
    }

    @Override
    public String getAge() {
        if (!loaded) {
            reload();
            loaded = true;
        }
        return userModel.getAge();
    }

    @Override
    public void setAge(String age) {
        userModel.setAge(age);
    }

    private void reload() {
        ResultSet resultSet = Database.queryByEquals(Database.COLUMN_ID, userModel.getId());
        userModel.setSex(resultSet.getData(Database.COLUMN_SEX));
        userModel.setAge(resultSet.getData(Database.COLUMN_AGE));
        System.out.println("加载年龄和性别");
    }

}
