import java.io.PrintStream;

public class Tempo_Increase extends Command {

    public Note execute(Note n, MidiFile mf, PrintStream s) {
        n.AumentaVelocidade();
        return n;
    }
}
