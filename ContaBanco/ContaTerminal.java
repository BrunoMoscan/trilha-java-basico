package ContaBanco;

import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Cadastro de Novas Contas--");
        System.out.println("Digite o nome do Cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("Digite o número da Agência em que deseja abrir esta conta: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("O cliente deverá depositar um valor como saldo inicial. \nQual valor será depositado?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, o número de sua Agência e Conta são: Agência " + agencia + " Nº da Conta: " + conta + ". Seu Saldo de R$ " + saldo + " já está disponível para sacar");
        scanner.close();
    }
}