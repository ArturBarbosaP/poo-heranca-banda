public class Tecladistas extends Artista
{
    private int nivel_tecladista;

    public Tecladistas(String nome, int idade, String banda, int nivel_tecladista)
    {
        super(nome, idade, banda);
        this.nivel_tecladista = nivel_tecladista;
    }

    public int getNivel_tecladista()
    {
        return nivel_tecladista;
    }

    public void setNivel_tecladista(int nivel_tecladista)
    {
        this.nivel_tecladista = nivel_tecladista;
    }
}