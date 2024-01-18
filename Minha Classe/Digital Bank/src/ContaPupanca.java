public class ContaPupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
    }

    
}
