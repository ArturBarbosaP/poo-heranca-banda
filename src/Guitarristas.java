public class Guitarristas extends Artista
{
    private int nivel_guitarrista;

    public Guitarristas(String nome, int idade, String banda, int nivel_guitarrista)
    {
        super(nome, idade, banda);
        this.nivel_guitarrista = nivel_guitarrista;
    }

    public int getNivel_guitarrista()
    {
        return nivel_guitarrista;
    }

    public void setNivel_guitarrista(int nivel_guitarrista)
    {
        this.nivel_guitarrista = nivel_guitarrista;
    }
}