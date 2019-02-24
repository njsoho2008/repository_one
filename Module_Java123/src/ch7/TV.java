package ch7;

public class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
   /* public TV(){
        this.channel=9;
        this.volumeLevel=8;
        this.on=true;
    }*/
    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if (newChannel>=1&&newChannel <= 120 &&on) {
            this.channel = newChannel;

        }

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newvolumeLevel) {
       if(newvolumeLevel>=1&&newvolumeLevel<=10&&on){
           this.volumeLevel=newvolumeLevel;
       }
    }

    public void VolumeUp() {
        if (on && volumeLevel < 10)
            volumeLevel++;
    }

    public void VolumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

    public void ChannelUp() {
        if (on && channel < 120)
            channel++;
    }

    public void ChannelDown() {
        if (on && channel > 1)
            channel--;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


}
