import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Entre com o numero da conta");
        int numero = scanner.nextInt();


        System.out.println("Entre com o nome do cliente");
        String nome = scanner.next();

        System.out.println("Entre com o saldo da conta");
        Double saldo = scanner.nextDouble();


        String result = "Olá "
                .concat(nome)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(Integer.toString(numero))
                .concat(" e seu saldo ")
                .concat(saldo.toString())
                .concat(" já está disponível para saque");

        System.out.println(result);
        scanner.close();


    }
}