public class Teste
{
   public static void main(String [] args){
      Empresa emp = new Empresa(100);
      Funcionario f1 = new Funcionario();
      Funcionario f2 = new Funcionario();
      Gerente g1 = new Gerente();
      
       g1.setNome("Teste gerente");
       g1.setSalario(2000.);
       g1.setRg("032155");
       
       f1.setNome("Teste");
       f1.setSalario(1000.);
       f1.setRg("031155");
       
       f2.setNome("Adolfo");
       f2.setSalario(1000.);
       f2.setRg("031155");
       
       emp.adiciona(f1);
       emp.adiciona(f2);
       
       System.out.println("Dados: " + g1.getNome());
       System.out.println("Bonificacao: " + g1.getBonificacao());
       System.out.println("Bonificacao: " + f1.getBonificacao());
       /*
       System.out.println("Identificador: "+ emp.funcionarios[0].getIdentificador());
       System.out.println("Identificador: "+ emp.funcionarios[1].getIdentificador());
       */
   }
}