package structure.proxyPattern.protectionProxy;

public interface UserModelApi {

    String getId();

    boolean setId(String id, String oid);

    String getName();

    boolean setName(String name, String id);

    String getSex();

    boolean setSex(String sex, String id);

    int getAge();

    boolean setAge(int age, String id);

}
