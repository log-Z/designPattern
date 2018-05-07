package structure.proxyPattern.protectionProxy;

public class Proxy implements UserModelApi {

    private UserModel userModel;

    public Proxy(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public String getId() {
        return userModel.getId();
    }

    @Override
    public boolean setId(String id, String oid) {
        if (userModel.getId().equals(oid)) {
            return userModel.setId(id, null);
        } else {
            System.out.println("修改编号时权限不足！");
            return false;
        }
    }

    @Override
    public String getName() {
        return userModel.getName();
    }

    @Override
    public boolean setName(String name, String id) {
        if (userModel.getId().equals(id)) {
            return userModel.setName(name, null);
        } else {
            System.out.println("修改姓名时权限不足！");
            return false;
        }
    }

    @Override
    public String getSex() {
        return userModel.getSex();
    }

    @Override
    public boolean setSex(String sex, String id) {
        if (userModel.getId().equals(id)) {
            return userModel.setSex(sex, null);
        } else {
            System.out.println("修改性别时权限不足！");
            return false;
        }
    }

    @Override
    public int getAge() {
        return userModel.getAge();
    }

    @Override
    public boolean setAge(int age, String id) {
        if (userModel.getId().equals(id)) {
            return userModel.setAge(age, null);
        } else {
            System.out.println("修改年龄时权限不足！");
            return false;
        }
    }

}
