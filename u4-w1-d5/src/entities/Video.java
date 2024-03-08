package entities;

import SetOptions.SetBrightness;
import SetOptions.SetVolume;

public class Video extends Multimedia implements SetBrightness, SetVolume {

    //ATTRIBUTES

    private int time;
    private int brightness;
    private int volume;

    //CONSTRUCTORS
    public Video(String title, int brightness, int time, int volume){
        super(title);
        this.brightness= brightness;
        this.time=time;
        this.volume=volume;
    }



    public void play() {
        if (this.time > 0 && this.volume >= 0 && this.volume <= 10 && this.brightness >= 0 && this.brightness <= 10) {
            for (int i = 0; i < time; i++) {
                System.out.println(this.title);
            }
            volumePrint();
            brightnessPrint();
        }
    }

    @Override
    public void incBrightness() {
        if (this.brightness>0){
            this.brightness++;
        }

    }

    @Override
    public void decrBrightness() {
        if (this.brightness>0){
            this.brightness--;
        }

    }
    @Override
    public void decrVolume() {


        if (this.volume>0){
            this.volume--;
        }
    }


    @Override
    public void incrVolume() {
        if (this.volume>0){
            this.volume++;
        }
    }

    @Override
    public void volumePrint() {


        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    @Override
    public void brightnessPrint() {

    }
}
