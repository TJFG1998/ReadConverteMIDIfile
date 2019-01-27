import java.io.PrintStream;

public class MajorScale extends Command {

    private int repeatimes = 0;

    public MajorScale(){}
    public MajorScale(int u){ repeatimes = u;}

    public Note execute(Note n, MidiFile mf, PrintStream s)
    {
        if(repeatimes == 0) {
            n.nota =60;
            n.velocidade = 32;

            new ParserVal(new Dot());
            new Up();
            new Up();
            new Dot();
            new Up();
            new Up();
            new Dot();
            new Up();
            new Dot();
            new Up();
            new Up();
            new Dot();
            new Up();
            new Up();
            new Dot();
            new Up();
            new Up();
            new Dot();
            new Up();
        }
        else {
             for(int i = 0;i < repeatimes;i++){

                 n.nota =60 + repeatimes;
                 n.velocidade = 32;

                 new Dot();
                 new Up();
                 new Up();
                 new Dot();
                 new Up();
                 new Up();
                 new Dot();
                 new Up();
                 new Dot();
                 new Up();
                 new Up();
                 new Dot();
                 new Up();
                 new Up();
                 new Dot();
                 new Up();
                 new Up();
                 new Dot();
                 new Up();
             }
        }
        return n;
    }

}
