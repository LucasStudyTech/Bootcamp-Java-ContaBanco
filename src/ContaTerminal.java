import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //classe Scanner
        Scanner scanner = new Scanner(System.in);
        

     System.out.print("Olá bem vindo ao seu banco, Aperta enter para continuar...");
         scanner.nextLine();


         //nome do cliente, guardado na memorai da String nomeCliente
        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        //numero da Agência, guardada memoria da String agencia 
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        //numero da conta, guardada na memoria da int numeroConta
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente


        //saldo do cliente, guardado no double saldo
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        //terminando as pergunta 
        scanner.close();

        //mostrando o nome do cliente
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
