public class ClientePJ extends Cliente{
    //tributo
    private String cnpj;
    //construtor
    public ClientePJ(String nome,String email,String cnpj){
        super(nome,email);
        this.cnpj=cnpj;
    }
    //métodos
    //getter
    public String getCnpj(){
        return this.cnpj;
    }
    //setter
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
}
