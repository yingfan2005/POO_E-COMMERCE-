public class PagamentoBoleto implements IPagamento{
    //atributo
    private String codigoBarras;
    //construtor
    public PagamentoBoleto(String codigoBarras)
    {
        this.codigoBarras=codigoBarras;
    }
    //métodos
    //getter
    public String getCodigoBarra(){
        return this.codigoBarras;
    }
    //setter
    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras=codigoBarras;
    }
    //outros métodos
    @Override
    public boolean processarPagamento(double valor)
    {
        if(valor<1000.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
