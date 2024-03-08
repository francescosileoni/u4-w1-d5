package entities;

import SetOptions.SetVolume;

public class Audio  extends Multimedia implements SetVolume {

    //ATTRIBUTES

    private int  volume;

    private int time;

    // CONSTRUCTORS

    public Audio(String title, int volume, int time){
        super(title);
        this.volume= volume;
        this.time= time;


    }

    //METHODS


    public void playTime(int time) {
        if (time <= 0) {
            System.err.println("La durata > di 0");
        } else {
            this.time = time;
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

}

