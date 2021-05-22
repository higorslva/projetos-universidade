public class Programa
{
    public static void main(String[] args)
    {
        Conta minhaConta = new Conta(123456);
        
        minhaConta.depositar(3000);
        minhaConta.sacar(2000);
        System.out.println("Total de contas: ");
        
    }
}
