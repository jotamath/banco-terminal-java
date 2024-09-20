import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = sc.nextDouble();

        // Exibe a mensagem com os dados formatados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        sc.close();

    }
}
