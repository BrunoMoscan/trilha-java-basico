public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void baixarVolume(){
        volume--;
        System.out.println("Baixando o volume para " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }
    public void baixarCanal(){
        canal--;
    }
    public void setarCanal(int novoCanal){
        canal = novoCanal;
    }
     
}