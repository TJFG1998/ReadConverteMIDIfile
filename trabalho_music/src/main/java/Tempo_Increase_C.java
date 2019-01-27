import java.io.PrintStream;

public class Tempo_Increase_C extends Command {

    private  int add;

    public Tempo_Increase_C(int u) {add = u;}

    public Note execute(Note n, MidiFile mf, PrintStream s) {
        n.AumentaVelocidadeC(add);
        return n;
    }
}
