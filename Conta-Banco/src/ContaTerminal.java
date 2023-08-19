import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe o numero da agencia :");
        numero = sc.nextInt();
        System.out.println("Informe sua agencia : ");
        agencia = sc.next();
        System.out.println("Informe seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Informe seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Ola : " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é : "+ agencia + " , conta : "+ numero +" , e seu saldo "+ saldo +" já está disponivel para saque");

    }
}
