public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channel;
    private int volume;

    public TV() {
        this.isOn = false;
        this.channel = 1;
        this.volume = 1;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public void channelUp() {
        if (isOn == true) {
            if (channel < 99) {
                channel = channel + 1;
            } else {
                channel = 1;
            }
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public void channelDown() {
        if (isOn == true) {
            if (channel > 1) {
                channel = channel - 1;
            } else {
                channel = 99;
            }
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public void setChannel(int channel) {
        if (isOn == true) {
            if (channel >= 1 && channel <= 99) {
                this.channel = channel;
            } else {
                System.out.println("There is no channel " + channel + "!");
            }
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public void volumeUp() {
        if (isOn == true) {
            if (volume < 10) {
                volume = volume + 1;
            }
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public void volumeDown() {
        if (isOn == true) {
            if (volume > 1) {
                volume = volume - 1;
            }
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public String displayInfo() {
        if (isOn == true) {
            return "TV is ON. You are now watching channel " + channel + ". The volume level is " + volume + ".";
        } else {
            return "TV is OFF.";
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.on();
        System.out.println(tv1.displayInfo());

        tv1.setChannel(15);
        for (int i = 0; i < 6; i++) {
            tv1.volumeUp();
        }
        System.out.println(tv1.displayInfo());

        tv1.off();
        System.out.println(tv1.displayInfo());
    }

}
