public class Note {
    int nota, velocidade;
    VarTab vars;

    public Note() {
        nota = 60; // dó
        velocidade = 32;
        vars = new VarTab();
    }

    public void AumentaVelocidade()
    {
        if(velocidade / 2 >= 4)
            velocidade = velocidade / 2;
        else
            velocidade = 4;
    }

    public void DiminuiVelocidade()
    {

        if(velocidade * 2 <= 64)
            velocidade = velocidade *2;
        else
            velocidade = 64;
    }

    public void DiminuiVelocidadeC(int add)
    {
        int aux;
        for(int i= 0;i<add;i++)
        {
            if (velocidade==64)
            {
                i = add;
                break;
            }
            aux = velocidade;
            aux *= 2;
            velocidade = aux;
        }
    }

    public void AumentaVelocidadeC(int add)
    {
        int aux;
        for(int i= 0;i<add;i++)
        {
            if (velocidade==4)
            {
                i = add;
                break;
            }
            aux = velocidade;
            aux /= 2;
            velocidade = aux;
        }
    }
}

//tou afk
