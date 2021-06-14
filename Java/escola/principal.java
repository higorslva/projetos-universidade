import java.io.*;
import java.util.Scanner;
    
public class principal{
    public static void main (String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        Arquivo arq = new Arquivo();
        Escola e1 = new Escola(10);
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Servidor s1 = new Servidor();
        
        do {
            System.out.print("1 - Criar arquivo relatorio.txt \n\t(Apenas para a primeira utilizaçao) \n");
            System.out.print("2 - Exibir lista de cadastados \n");
            System.out.print("3 - Cadastrar dados \n");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    arq.criaArquivo();
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    arq.listarArquivo();
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    try{
                        do{
                            FileWriter relatorio = new FileWriter("relatorio.txt", true);
                            entrada = new Scanner(System.in);
                            relatorio.write("--------------------------------");
                            relatorio.write("\n");
                            System.out.println("Dica: Digite 'fim' para voltar ao menu");
                            System.out.println("Nome: ");
                            p1.nome=entrada.next();
                            relatorio.write("Nome: " + p1.nome);
                            relatorio.write("\n");
                            if(p1.nome.equalsIgnoreCase("fim")){
                                System.out.println("Total de cadastrados: " + e1.controle); //Total de pessoas cadastradas
                                System.out.println("Média de idades dos alunos: " + e1.mediaIdadeAlunos()); //Media de idade dos alunos
                                System.out.println("O professor mais velho tem :" + e1.ProfessorMaisVelho() + " de idade."); //Professor mais velho
                                
                                break;
                            }else{
                                System.out.println("Sexo\n[M] - [F]:" );
                                p1.sexo = entrada.next();
                                relatorio.write("Sexo: " + p1.sexo);
                                relatorio.write("\n");
                                
                                System.out.println("Idade: ");
                                p1.idade = entrada.nextInt();
                                relatorio.write("Idade: " + p1.idade);
                                relatorio.write("\n");
                                
                                System.out.println("CPF: ");
                                p1.cpf = entrada.next();
                                relatorio.write("CPF: " + p1.cpf);
                                relatorio.write("\n");
                                
                                System.out.println("Função (Aluno, Professor, ou Servidor)");
                                p1.atributo = entrada.next();
                                relatorio.write("Atributo: " + p1.atributo);
                                relatorio.write("\n");
                                if(p1.atributo.equalsIgnoreCase("aluno")){
                                    //atributos do aluno
                                    System.out.println("Nº de matricula: ");
                                    a1.matricula = entrada.next();
                                    relatorio.write("Nº de Matricula: " + a1.matricula);
                                    relatorio.write("\n");
                                }else if(p1.atributo.equalsIgnoreCase("professor")){
                                    //atributos do professor
                                    System.out.println("Especialidade (Materia) do(a) professor(a):");
                                    pr1.especialidade = entrada.next();
                                    relatorio.write("Especialidade: " + pr1.especialidade);
                                    relatorio.write("\n");
                                    
                                    System.out.println("Salario:");
                                    pr1.salario = entrada.nextDouble();
                                    relatorio.write("Salario: R$" + pr1.salario);
                                    relatorio.write("\n");
                                    
                                }else if(p1.atributo.equalsIgnoreCase("servidor")){
                                    //atributos do servidor
                                    System.out.println("Função do servidor (Secretario(a), psicologo(a), etc");
                                    s1.funcao = entrada.next();
                                    relatorio.write("Funçao: " + s1.funcao);
                                    relatorio.write("\n");
                                    
                                    System.out.println("Salário: ");
                                    s1.salario = entrada.nextDouble();
                                    relatorio.write("Salario: R$" + s1.salario);
                                    relatorio.write("\n");
                                    
                                }else{
                                    System.out.println("Erro inesperado!");
                                }
                                
                                e1.cadastrar(p1);
                                p1 = new Pessoa();
                                p1.nome = "";
                                
                                relatorio.flush();
                            }     
                    }while(!p1.nome.equalsIgnoreCase("fim"));
                    break;
                }catch(IOException ex){
                    System.out.println("Erro ao gravar no arquivo: "+ex.getMessage()); 
                }
                case 4:
                    System.exit(0);
                    break;
            }
        }while (opcao != 4);
    }
}