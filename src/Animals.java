import java.util.Random;

/*
 * Superclass for all animal types
 * Contains the random number generator that creates a variable output in the sleep() method
 */
public class Animals {

    Animals(){

    }

    // sleep method to be unmodified by sublcasses
    public String sleep(String name){
        // random output generator
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0) {
            return name + " falls asleep.";
        }
        else if(rand_int == 1){
            return name + " refuses to go to sleep and plays in the dark.";
        }
        else{
            return name + " lies down but hasn't fall asleep yet.";
        }
    }

    /*
     * Contains method signatures to be inherited and modified
     */
    public String wakeUp() {
        return "...";
    }

    public String makeNoise() {
        return "...";
    }

    public String eat(String name) {
        return "...";
    }

    public String roam(String name) {
        return "...";
    }

    public String getName(){
       return "..";
    }
}

