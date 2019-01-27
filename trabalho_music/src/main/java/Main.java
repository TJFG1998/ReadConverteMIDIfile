import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Parser parser = null;
        try
        {
            parser = new Parser(
                    new InputStreamReader(
                            new FileInputStream("src/main/resources/input.txt")
                    ));
        }
        catch(FileNotFoundException e){
            System.err.println("File input not found!");
            System.exit(1);
        }

        parser.yyparse();

        System.out.println();

        Note note = new Note();
        MidiFile mf = new MidiFile();

        PrintStream file = null;
        try {
            file = new PrintStream("target/out.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Erro de criação");
            System.exit(1);
        }

        for (Command c: parser.commands) {
            note = c.execute(note, mf, file);
        }
        try {
            mf.writeToFile("MUSIC.mid");
        }
        catch (Exception e)
        {
            System.err.println("O ficheiro não foi criado.");
        }
    }
}