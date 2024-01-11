package ControleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Insira o menor valor:");
        int n1 = x.nextInt();

        System.out.println("Agora insira o maior valor:");
        int n2 = x.nextInt();

        try {
            if (n2 > n1) {
                contar(n1, n2);
            } else {
                throw new ParametrosInvalidosException("Insira o menor valor primeiro!");
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        x.close();
    }

    public static void contar(int n1, int n2) {
        for (int i = 1; i <= (n2-n1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}