public class Produto{
    //atributos
    protected String nome;
    protected double preco;
    protected int estoque;
    //construtor
    public Produto(String nome,double preco,int estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
    }
    //métodos
    //getters
    public String getNome()
    {
        return this.nome;
    }
    public double getPreco()
    {
        return this.preco;
    }
    public int getEstoque()
    {
        return this.estoque;
    }
    //setters
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setPreco(double preco)
    {
        this.preco=preco;
    }
    public void setEstoque(int estoque)
    {
        this.estoque=estoque;
    }
}
