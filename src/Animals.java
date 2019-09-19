//package src;
import java.util.Random;

public class Animals {

    Animals(){

    }

    public String sleep(String name){
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

