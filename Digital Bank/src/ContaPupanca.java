public class ContaPupanca extends Conta{
    public ContaPupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
    }

    
}
