public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(22);
        System.out.println("Canal atual é: " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status ->TV ligada ? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status ->TV ligada ? " + smartTv.ligada);
    }
    
}
