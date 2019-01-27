import java.util.Hashtable;

public class VarTab {

    private Hashtable<String, Integer> dic;

    public  VarTab() {
        dic = new Hashtable<String, Integer>();
    }

    public void setVariable(String var, int val) {
        dic.put(var, val);
    }

    public int getVariable(String var) throws Exception {
        if (dic.containsKey(var)) {
            return dic.get(var);
        }
        throw new Exception("Variable "+ var +" not defined");
    }
}
