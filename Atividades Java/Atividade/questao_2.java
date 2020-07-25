//Questão 2 da lista
import java.util.Scanner;

public class questao_2
{
    public static void main(String[] args){
    float sal_min, sal_emp, num_sal_min;

    System.out.println("Digite o salário que o funcionário recebe:");
    sal_emp = new Scanner(System.in).nextInt();
    System.out.println("Digite o salário mínimo: ");
    sal_min = new Scanner(System.in).nextInt();
    
    num_sal_min = sal_emp/sal_min;
    
    System.out.println("O funcionário recebe "+num_sal_min+" salários mínimos.");
}
    
}
