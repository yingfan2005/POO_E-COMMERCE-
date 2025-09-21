public class PagamentoCartaoCredito implements IPagamento{
    //atributo
    private String numeroCartao;
    //construtor
    public PagamentoCartaoCredito(String numeroCartao){
        this.numeroCartao=numeroCartao;
    }
    //métodos
    //getter
    public String getNumeroCartao(){
        return this.numeroCartao;
    }
    //setter
    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao=numeroCartao;
    }
    //outro método
    @Override
    public boolean processarPagamento(double valor){
        if(valor<200.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
