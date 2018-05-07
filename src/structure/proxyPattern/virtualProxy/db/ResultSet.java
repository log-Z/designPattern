package structure.proxyPattern.virtualProxy.db;

import java.util.List;

public class ResultSet {

    private List<String[]> mResult;
    private int row = 0;

    ResultSet(List<String[]> result) {
        mResult = result;
    }

    public boolean next() {
        return ++row < mResult.size();
    }

    public String getData(int column) {
        String data = null;
        if (column >= 0 && row < mResult.size()) {
            String[] dataRow = mResult.get(row);
            if (column < dataRow.length) {
                data = dataRow[column];
            }
        }
        return data;
    }

}
