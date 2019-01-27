import java.io.PrintStream;

public class Dot extends Command {

    public Dot() {}

    public Note execute(Note n, MidiFile mf, PrintStream s) {

        mf.noteOnOffNow(n.velocidade, n.nota, 127);

        return n;
    }

}
