//package src;
import java.util.Random;

public class Dog extends Canine {
    private String dogName;

    // Constructors
    Dog(String name){
        this.dogName = name;
    }

    public String getName(){
      return this.dogName;
    }

    public void makeNoise(){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0){
            System.out.println("Bark Bark!");
        }
        else if(rand_int == 1){
            System.out.println("Barkkkkkkk! Because " + this.dogName + " is very hungry!");
        }
        else{
            System.out.println("Whinn... Because" + this.dogName + " is sick!");
        }
    }

    public void wakeUp(){
        System.out.println(this.dogName + " slowly opens his/her eyes and stretches.");
    }

}
