import java.util.Scanner;
public class par
{
    public par()
    {
        int a;
        System.out.println ("Digite um número: ");
        Scanner days = new Scanner(System.in);  
        a = days.nextInt();
        if (a % 2 == 0){
            System.out.println("Número " + a + " é par.");
        }else{
            System.out.println("Número " + a + " é ímpar.");
        }
    }
}
