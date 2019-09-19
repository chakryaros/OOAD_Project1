//package src;

import java.util.Random;

public class Canine extends Animals {
    Canine(){
    }

    /*
     *eat() and roam() are to be unmodified by subclasses
     */
    public String eat(String name){
        return name + " eats the steak in a hurry!";
    }

    /*
     * another random response generator
     */
    public String roam(String name){
        // generating then selecting random number
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
}
