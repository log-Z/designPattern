package structure.proxyPattern.virtualProxy;

public class UserModel implements UserModelApi {

    private String mId;
    private String mName;
    private String mSex;
    private String mAge;

    @Override
    public String getId() {
        return mId;
    }

    @Override
    public void setId(String id) {
        mId = id;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void setName(String name) {
        mName = name;
    }

    @Override
    public String getSex() {
        return mSex;
    }

    @Override
    public void setSex(String sex) {
        mSex = sex;
    }

    @Override
    public String getAge() {
        return mAge;
    }

    @Override
    public void setAge(String age) {
        mAge = age;
    }

}
