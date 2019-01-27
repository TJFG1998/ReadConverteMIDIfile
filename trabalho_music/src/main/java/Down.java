import java.io.PrintStream;

public class Down extends Command {
    private Value repeatTimes;

    public Down() {}
    public Down(Value u) {repeatTimes = u;}

    public Note execute(Note n, MidiFile mf, PrintStream s) {
        if (repeatTimes == null) {
            n.nota--;
            return n;
        }

        for (int i=0; i < repeatTimes.Eval(n); i++)
            n.nota--;

        return n;
    }
}
