import java.io.PrintStream;
public abstract class Command {
    public abstract Note execute(Note n, MidiFile mf, PrintStream s);
}
