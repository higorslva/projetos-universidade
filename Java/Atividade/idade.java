import java.util.Scanner;

public class idade
{
    public idade()
    {
        double dias, mes, ano;
        Scanner days = new Scanner(System.in);
        Scanner years = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        System.out.println("Insira sua idade, seguido de anos, meses e dias:\n");
        System.out.println("Anos: ");
        ano = years.nextInt();
        
        System.out.println("Meses: ");
        mes = month.nextInt();
        
        System.out.println("dias: ");
        dias = days.nextInt();
        
        ano = ano*365;
        mes = mes*30.4167;
        
        dias = ano+mes+dias;
        
        if (mes < 12){
            System.out.println("Formato de meses inválidos. Máximo permitido: 12 meses.");
        }
        else if( dias < 31){
            System.out.println("Formato de dias inválidos. Máximo permitido: 31 dias.");
        }
        else if( dias < 31 && mes < 12){
            System.out.println("Formato de dias e meses inválidos. Máximo permitido: 12 meses / 31 dias");
        }
        else{
            System.out.println("Sua idade em dias é: " + dias);
        }
    }
}
