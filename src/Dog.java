import java.util.Random;
// subclass of Canine
public class Dog extends Canine {
    private String dogName;

    // Constructors
    Dog(String name){
        this.dogName = name;
    }

    public String getName(){
      return this.dogName;
    }

    // implementation of superclass method makeNoise()
    public String makeNoise(){
        // random output
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

    // implemntation of superclass Animals
    public String wakeUp(){
        return this.dogName + " slowly opens his/her eyes and stretches.";
    }

}
