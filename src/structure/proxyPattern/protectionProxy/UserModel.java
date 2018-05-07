package structure.proxyPattern.protectionProxy;

public class UserModel implements UserModelApi {

    private String mId;
    private String mName;
    private String mSex;
    private int mAge;

    public UserModel(String id, String name, String sex, int age) {
        mId = id;
        mName = name;
        mSex = sex;
        mAge = age;
    }

    @Override
    public String getId() {
        return mId;
    }

    @Override
    public boolean setId(String id, String oid) {
        mId = id;
        return true;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public boolean setName(String name, String id) {
        mName = name;
        return true;
    }

    @Override
    public String getSex() {
        return mSex;
    }

    @Override
    public boolean setSex(String sex, String id) {
        mSex = sex;
        return true;
    }

    @Override
    public int getAge() {
        return mAge;
    }

    @Override
    public boolean setAge(int age, String id) {
        mAge = age;
        return true;
    }

}
