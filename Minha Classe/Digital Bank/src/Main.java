public class Main {
    public static void main(String[] args) throws Exception {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno Silva");


        Conta cc = new ContaCorrente(bruno);
        Conta cp = new ContaPupanca(bruno);

        cc.depositar(100);
        cc.transferir(cp, 80);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    
    }
}
