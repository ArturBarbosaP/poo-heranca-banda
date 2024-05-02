public class Bateristas extends Artista
{
    private int nivel_baterista;

    public Bateristas(String nome, int idade, String banda, int nivel_baterista)
    {
        super(nome, idade, banda);
        this.nivel_baterista = nivel_baterista;
    }

    public int getNivel_baterista()
    {
        return nivel_baterista;
    }

    public void setNivel_baterista(int nivel_baterista)
    {
        this.nivel_baterista = nivel_baterista;
    }
}