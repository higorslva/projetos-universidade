import java.io.*;

public class Arquivo{
    public void criaArquivo(){
        try{ 
            FileWriter relatorio = new FileWriter("relatorio.txt", true);
            System.out.println("Arquivo criado \n");
        }catch(IOException ex){
            System.out.print("Não foi possivel criar o relatorio: " +ex.getMessage());
        }
    }
    
    public void listarArquivo(){
        File relatorio = new File("relatorio.txt");
        try(FileReader fr = new FileReader(relatorio)){
            int c = fr.read();
            while(c!= -1){
                System.out.print((char)c);
                c = fr.read();
            }
        }catch(IOException ex){} 
    }
}
