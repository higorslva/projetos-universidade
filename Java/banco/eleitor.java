public class eleitor {
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public int getIdade (){
        return this.idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void votar(){
        if(this.getIdade() >= 15) {
            System.out.println("Voto confirmado");
        }else{
            System.out.println("Sua idade nao e suficiente para votar");
        }
    }
}