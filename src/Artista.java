public class Artista
{
    private String nome;
    private int idade;
    private String banda;

    public Artista(String nome, int idade, String banda)
    {
        this.nome = nome;
        this.idade = idade;
        this.banda = banda;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getBanda()
    {
        return banda;
    }

    public void setBanda(String banda)
    {
        this.banda = banda;
    }
}