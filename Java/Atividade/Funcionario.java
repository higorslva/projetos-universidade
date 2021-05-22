import java.util.Scanner;

public class Funcionario
{
    public Funcionario()
    {   
        int n = 5;
        int empr[] =  new int [n];
        int i;
        String nome;
        float data_nasc, rg, data_adm, salário;
        Scanner teclado = new Scanner(System.in);
        for (i = 0; i < n; i++){
            System.out.print("Informe Nome Completo: ");
            nome = teclado.nextLine();
            
            System.out.println ("Empregado " + nome + " cadastrado.");
        }
        System.out.printf("\n");
        for (i=0; i<n; i++){
            //System.out.println ("Empregados: " + nome + "\n");
        }
    }
}
