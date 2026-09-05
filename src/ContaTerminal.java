import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in );

        System.out.println("Por favor digite o numero da conta : ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência :");
        String numeroAgencia=sc.nextLine();


        System.out.println("Por favor, digite o seu nome : ");
        String nomeCliente=sc.nextLine();

        System.out.println("Por favor, insira o saldo :");
       double saldo =sc.nextDouble();

        System.out.println("Olá " +nomeCliente + "\nobrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
        + " , conta " +numeroConta + " e seu saldo " +saldo + " , já está disponível para saque.");



    }
}