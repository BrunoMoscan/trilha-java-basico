public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Canal inicial: " + smartTv.canal);

        smartTv.setarCanal(13);
        
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);


    }
}
