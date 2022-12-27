public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void on() {
        this.on = true;
    }
    
    public void off() {
        this.on = false;
    }

    public void changeChannel(int newChannel) {
        this.channel = newChannel;
    }

    public void turnUpTheChannel() {
        this.channel++;
        System.out.println("Turning up the channel to : " + channel);
    }

    public void turnDownTheChannel() {
        this.channel--;
        System.out.println("Turning the channel down to : " + channel);
    }

    public void turnUpTheVolume() {
        this.volume++;
        System.out.println("Turning up the volume to : " + volume);
    }

    public void turnDownVolume() {
        this.volume--;
        System.out.println("Turning the volume down to : " + volume);
    }

}
