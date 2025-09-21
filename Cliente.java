public abstract class Cliente{
    //atributos
    protected String nome;
    protected String email;
    //cosntrutor
    public Cliente(String nome,String email){
        this.nome=nome;
        this.email=email;
    }
    //métodos
    //getters
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    //setters
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
