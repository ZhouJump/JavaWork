package work2;

/**
 * @author SXL601020
 */
public class ZhouChuJie {
    private int data;
    private String str;

    public void setData(int da) {
        data = da;
    }

    public int getData() {
        return data;
    }

    public void setStr(String st) {
        str = st;
    }

    public String getStr() {
        return str;
    }

    public String toStr() {
        return "data:" + data + " str:" + str;
    }
}
