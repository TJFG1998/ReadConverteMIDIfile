public class Value {

    private int intVal;
    private String varName;

    public Value(String n) { varName = n; }
    public Value(int v) { intVal = v; }

    public int Eval(Note n) {
        if (varName == null) {
            return intVal;
        }

        try {
            return n.vars.getVariable(varName);
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

        return -1; // never happens.. shut-up IntelliJ
    }
}
