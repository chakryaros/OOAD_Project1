
import java.util.Random;

// 1st tier subclass
public class Feline extends Animals {

    Feline(){
    }
    // implementation of superclass method
    public String roam(String name){
        // random output
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0){
            return name + " roams his/her area.";
        }
        else if(rand_int == 1){
            return name + " is lazy and refuses to roam.";
        }
        else{
            return name + " roams a little and stopped.";
        }
    }
    // implementation of superclass Animal method
    public String eat(String name){
      return name + " eats the fish in a hurry!";
    }
}
