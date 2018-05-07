package structure.proxyPattern.virtualProxy.db;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static final int COLUMN_ID = 0;
    public static final int COLUMN_NAME = 1;
    public static final int COLUMN_SEX = 2;
    public static final int COLUMN_AGE = 3;
    private final static String[] TABLE = new String[] {
            "001,张三,男,20",
            "002,小红,女,18",
            "003,老王,男,66",
    };

    public static ResultSet queryByEquals(int column, String value) {
        List<String[]> result = new ArrayList<>();
        for (String dataRow : TABLE) {
            String[] data = dataRow.split(",");
            if (column < 0 || column < data.length && data[column].equals(value)) {
                result.add(data);
            }
        }
        return new ResultSet(result);
    }

}
