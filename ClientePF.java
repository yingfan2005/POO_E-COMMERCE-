public class ClientePF extends Cliente{
    //atributo
    private String cpf;
    //construtor
    public ClientePF(String nome,String email,String cpf){
        super(nome,email);
        this.cpf=cpf;
    }
    //métodos
    //getters
    public String getCpf(){
        return this.cpf;
    }
    //setters
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
