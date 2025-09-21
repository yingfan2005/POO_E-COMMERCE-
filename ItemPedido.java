public class ItemPedido{
    //atributos
    private Produto produto;
    private int quantidade;
    //construtor
    public ItemPedido(Produto produto,int quantidade){
        this.produto=produto;
        this.quantidade=quantidade;
    }
    //métodos
    //getters
    public Produto getProduto(){
        return this.produto;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    //setters
    public void setProduto(Produto produto){
        this.produto=produto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    //outros métodos
    public double getSubtotal(){
        return this.produto.preco*this.quantidade;
    }
}
