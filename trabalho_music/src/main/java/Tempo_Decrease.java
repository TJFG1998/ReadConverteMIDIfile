import java.io.PrintStream;

public class Tempo_Decrease extends Command {

    public Note execute(Note n, MidiFile mf, PrintStream s) {
        n.DiminuiVelocidade();
        return n;
    }
}