public class Main {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    
    }
}
