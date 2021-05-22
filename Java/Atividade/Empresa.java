public class Empresa    
{
    String nome;
    String cnpj;
    int controle;
    Funcionario[] funcionarios;
    
    public Empresa(int quantidade)
    {
        this.controle = 0;
        funcionarios = new Funcionario[quantidade];
        
        Empresa emp = new Empresa (10);
    }
    
    public void adiciona(Funcionario f)
    {
        if (this.controle < funcionarios.length){
            funcionarios[this.controle] = new Funcionario();
            funcionarios[this.controle] = f;
            this.controle++;
        }else{
            int novoTamanho = funcionarios.length + 1;
            Funcionario[] novoArray = new Funcionario[novoTamanho];
            
            for (int i = 0; i < funcionarios.length; i++){
                novoArray [i] = funcionarios[i];
            }
            novoArray[funcionarios.length] = f;
            funcionarios = novoArray;
            this.controle++;
        }
    }
}
