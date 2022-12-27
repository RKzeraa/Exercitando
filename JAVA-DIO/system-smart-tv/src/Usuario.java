public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.turnDownVolume();
       smartTv.turnDownVolume();
       smartTv.turnDownVolume();
       smartTv.turnDownVolume();
       smartTv.turnUpTheVolume();

       System.out.println("Current Channel : " + smartTv.channel);

       smartTv.changeChannel(13);

       System.out.println("Current Channel : " + smartTv.channel);
       

       System.out.println("Current Volume : " + smartTv.volume);

       System.out.println("TV on ? " + smartTv.on);

    
        smartTv.on();
        System.out.println("New status -> TV on ? " + smartTv.on);

        smartTv.off();
        System.out.println("New status -> TV on ? " + smartTv.on);
    }
}
