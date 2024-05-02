public class Cantores extends Artista
{
    private int nivel_cantor;

    public Cantores(String nome, int idade, String banda, int nivel_cantor)
    {
        super(nome, idade, banda);
        this.nivel_cantor = nivel_cantor;
    }

    public int getNivel_cantor()
    {
        return nivel_cantor;
    }

    public void setNivel_cantor(int nivel_cantor)
    {
        this.nivel_cantor = nivel_cantor;
    }
}