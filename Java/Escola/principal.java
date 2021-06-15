import java.io.*;
import javax.swing.*;
    
public class principal{
    public static void main (String[] args) throws IOException{
        int opcao;
        
        Arquivo arq = new Arquivo();
        Escola e1 = new Escola(10);
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Servidor s1 = new Servidor();
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, new Object[]{
                "Use o teclado numérico para selecionar a opção desejada\n\n",
                "1 - Criar arquivo relatorio.txt",
                "(Apenas para a primeira utilizaçao)",
                "2 - Exibir lista de cadastrados",
                "3 - Cadastrar dados",
                "4 - Limpar dados cadastrados",
                "5 - Sair"},
                JOptionPane.INFORMATION_MESSAGE));
            
            switch (opcao){
                case 1:
                    arq.criaArquivo();
                    break;
                case 2:
                    arq.listarDados();
                    break;
                case 3:
                    try{
                        do{
                            FileWriter relatorio = new FileWriter("relatorio.txt", true);
                            relatorio.write("--------------------------------");
                            relatorio.write("\n");
                            p1.nome = JOptionPane.showInputDialog("Dica: Digite 'fim' para voltar ao menu\nNome: ");
                            relatorio.write("Nome: " + p1.nome);
                            relatorio.write("\n");
                            if(p1.nome.equalsIgnoreCase("fim")){
                                JOptionPane.showInputDialog(null, new Object[]{
                                    "Total de cadastrados: " + e1.controle,
                                    "Média de idades dos alunos: " + e1.mediaIdadeAlunos(),
                                    "O professor mais velho tem :" + e1.ProfessorMaisVelho() + " de idade."
                                },JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }else{
                                p1.sexo = JOptionPane.showInputDialog("Sexo\n[M] - [F]:" );
                                relatorio.write("Sexo: " + p1.sexo);
                                relatorio.write("\n");
                                
                                p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                                relatorio.write("Idade: " + p1.idade);
                                relatorio.write("\n");
                                
                                p1.cpf = JOptionPane.showInputDialog("CPF: ");
                                relatorio.write("CPF: " + p1.cpf);
                                relatorio.write("\n");
                                
                                p1.atributo = JOptionPane.showInputDialog("Função (Aluno, Professor, ou Servidor)");
                                relatorio.write("Atributo: " + p1.atributo);
                                relatorio.write("\n");
                                if(p1.atributo.equalsIgnoreCase("aluno")){
                                    //atributos do aluno
                                    a1.matricula = JOptionPane.showInputDialog("Nº de matricula: ");
                                    relatorio.write("Nº de Matricula: " + a1.matricula);
                                    relatorio.write("\n");
                                }else if(p1.atributo.equalsIgnoreCase("professor")){
                                    //atributos do professor
                                    pr1.especialidade = JOptionPane.showInputDialog("Especialidade (Materia) do(a) professor(a):");
                                    relatorio.write("Especialidade: " + pr1.especialidade);
                                    relatorio.write("\n");
                                    
                                    pr1.salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
                                    relatorio.write("Salario: R$" + pr1.salario);
                                    relatorio.write("\n");
                                    
                                }else if(p1.atributo.equalsIgnoreCase("servidor")){
                                    //atributos do servidor
                                    s1.funcao = JOptionPane.showInputDialog("Função do servidor (Secretario(a), psicologo(a), etc");
                                    relatorio.write("Funçao: " + s1.funcao);
                                    relatorio.write("\n");
                                    
                                    s1.salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
                                    relatorio.write("Salario: R$" + s1.salario);
                                    relatorio.write("\n");
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "Erro inesperado!");
                                }
                                
                                e1.cadastrar(p1);
                                p1 = new Pessoa();
                                p1.nome = "";
                                
                                relatorio.flush();
                            }     
                    }while(!p1.nome.equalsIgnoreCase("fim"));
                    break;
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo: "+ex.getMessage()); 
                }
                case 4:
                    arq.limparDados();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (opcao != 5);
    }
}