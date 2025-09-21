import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Pedido{
    //atributos
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;
    
    //construtor
    public Pedido(Cliente cliente)
    {
        this.cliente = cliente;
        this.data=LocalDate.now();
        this.itens=new ArrayList<>();

    }
    //métodos
    //getters
    public Cliente getCliente()
    {
        return this.cliente;
    }
    /*public Ipagamento getMetodoPagamento()
    {
        return this.metodoPagamento;
    }*/
    public List<ItemPedido> getItens()
    {
        return this.itens;
    }
    //setters
    public void setCliente(Cliente cliente)
    {
        this.cliente=cliente;
    }
    public void setMetodoPagamento(IPagamento metodoPagamento)
    {
        this.metodoPagamento=metodoPagamento;
    }
    public void setItens(List<ItemPedido> itens)
    {
        this.itens=itens;
    }
    //outros métodos
    public void adicionarItem(ItemPedido item)
    {
        this.itens.add(item);
    }

    public double calcularTotal()
    {
        double total=0.0;
        for(ItemPedido itens:  this.itens)
        {
            total+=itens.getSubtotal();
        }
        return total;
    }


}
