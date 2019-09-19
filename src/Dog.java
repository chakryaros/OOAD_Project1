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

    public String makeNoise(){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0){
            return "Bark Bark!";
        }
        else if(rand_int == 1){
            return "Barkkkkkkk! Because " + this.dogName + " is very hungry!";
        }
        else{
            return "Whinn... Because " + this.dogName + " is sick!";
        }
    }

    public String wakeUp(){
        return this.dogName + " slowly opens his/her eyes and stretches.";
    }

}
