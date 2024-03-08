package entities;

import SetOptions.SetBrightness;

public class Image extends Multimedia  implements SetBrightness {


    //ATTRIBUTES
 private int brightness;

    //CONSTRUCTOR
    public Image (String title, int brightness){
        super(title);
        this.brightness= brightness;

    }

   // METHODS
    public void show(){

            System.out.println("Image: " + this.title);
            System.out.println("Brightness: " + this.brightness);

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
    public void brightnessPrint() {

    }
}
