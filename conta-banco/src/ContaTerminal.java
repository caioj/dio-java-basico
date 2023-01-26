import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar class Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no termnial 
        //Exibir a mensagem conta cirada
    
        Scanner scan = new Scanner(System.in);

        String nomeCliente, agencia;
        int numeroConta;
        double saldo;

        System.out.println("-----Dados Bancario-----");

        System.out.println("Por favor, digite o numero da Conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Agora digite o numero da Agencia: ");
        agencia = scan.next();

        System.out.println("Insira seu nome: ");
        nomeCliente = scan.next();

        saldo = 1500;

        System.out.println("---------------------------------------------------------");
        System.out.println("Ola! " + nomeCliente + " Obrigado por criar uma conta em nosso banco!");
        System.out.println(" Agencia: " + agencia);
        System.out.println(" Conta: "   + numeroConta);
        System.out.println(" Saldo: "   + saldo + " disponivel para saque!");

        System.out.println("-----------------------------------------------------------");
        System.out.println("Tenha um Otimo Dia!");
 
    scan.close();
    } 
}
