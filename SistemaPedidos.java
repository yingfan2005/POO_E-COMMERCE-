public class SistemaPedidos{
    public static void main(String[] args){
        //produtos
        Produto produto1 = new Produto("KeyBoard",100,100);
        Produto produto2 = new Produto("Mouse",30.0,200);
        Produto produto3 = new Produto("Capa de Notebook",40.0,150);

        //primeiro cliente
        ClientePF cliente1 = new ClientePF("João","joao@gmail.com","123456");
        Pedido pedido1 = new Pedido(cliente1);
        ItemPedido I1 = new ItemPedido(produto2,5);
        pedido1.adicionarItem(I1);
        PagamentoCartaoCredito p1 = new PagamentoCartaoCredito("1234");
        boolean res;
        res=p1.processarPagamento(pedido1.calcularTotal());
        if(res)
        {
            System.out.println("O pagamento do cliente "+ cliente1.getNome()+" foi realizado com sucesso.");
            System.out.println("Produto: "+ I1.getProduto().getNome());
            System.out.println("Quantidade: "+ I1.getQuantidade());
            System.out.println("Preço total: "+ pedido1.calcularTotal());
        }
        else
        {
            System.out.println("O pagamento do cliente "+ cliente1.getNome()+" não foi realizado com sucesso.");
        }
        //segundo cliente
        ClientePF cliente2 = new ClientePF("Ana","ana@gmail.com","112233");
        Pedido pedido2 = new Pedido(cliente2);
        ItemPedido I2 = new ItemPedido(produto1,5);
        pedido2.adicionarItem(I2);
        PagamentoCartaoCredito p2 = new PagamentoCartaoCredito("1122");
        res=p2.processarPagamento(pedido2.calcularTotal());
        if(res)
        {
            System.out.println("O pagamento do cliente "+ cliente2.getNome()+" foi realizado com sucesso.");
            System.out.println("Produto: "+ I2.getProduto().getNome());
            System.out.println("Quantidade: "+ I2.getQuantidade());
            System.out.println("Preço total: "+ pedido2.calcularTotal());
        }
        else
        {
            System.out.println("O pagamento do cliente "+ cliente2.getNome()+" não foi realizado com sucesso.");
        }
        //terceiro cliente
        ClientePJ cliente3 = new ClientePJ("Maria","maria@gmail.com","maria LDTA");
        Pedido pedido3 = new Pedido(cliente3);
        ItemPedido I3 = new ItemPedido(produto3,20);
        pedido3.adicionarItem(I3);
        PagamentoBoleto p3 = new PagamentoBoleto("11111");
        res=p3.processarPagamento(pedido3.calcularTotal());
        if(res)
        {
            System.out.println("O pagamento do cliente "+ cliente3.getNome()+" foi realizado com sucesso.");
            System.out.println("Produto: "+ I3.getProduto().getNome());
            System.out.println("Quantidade: "+ I3.getQuantidade());
            System.out.println("Preço total: "+ pedido3.calcularTotal());
        }
        else
        {
            System.out.println("O pagamento do cliente "+ cliente2.getNome()+" não foi realizado com sucesso.");
        }
        //cliente 4
        ClientePJ cliente4 = new ClientePJ("Isabela","isabela@gmail.com","Isabela LDTA");
        Pedido pedido4 = new Pedido(cliente4);
        ItemPedido I4 = new ItemPedido(produto1,1);
        ItemPedido I5 = new ItemPedido(produto2,20);
        ItemPedido I6 = new ItemPedido(produto3,20);
        pedido4.adicionarItem(I4);
        pedido4.adicionarItem(I5);
        pedido4.adicionarItem(I6);
        PagamentoBoleto p4 = new PagamentoBoleto("3344");
        res=p4.processarPagamento(pedido4.calcularTotal());
        if(res)
        {
            System.out.println("O pagamento do cliente "+ cliente4.getNome()+" foi realizado com sucesso.");
            System.out.println("Produto: "+ I4.getProduto().getNome());
            System.out.println("Produto: "+ I5.getProduto().getNome());
            System.out.println("Produto: "+ I6.getProduto().getNome());
            System.out.println("Quantidade: "+ I4.getQuantidade());
            System.out.println("Preço total: "+ pedido4.calcularTotal());
        }
        else
        {
            System.out.println("O pagamento do cliente "+ cliente4.getNome()+" não foi realizado com sucesso.");
        }

    }
}
