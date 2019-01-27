import java.io.PrintStream;

public class Tempo_Decrease_C extends Command {

    private int add;

    public Tempo_Decrease_C(int u) {add = u;}

    public Note execute(Note n, MidiFile mf, PrintStream s) {
        n.DiminuiVelocidadeC(add);
        return n;
    }
}
