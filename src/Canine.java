//package src;

import java.util.Random;

public class Canine extends Animals {
    Canine(){
      // System.out.println("The Zookeeper tends to the Canine side of the zoo");
    }

    public void eat(String name){
        System.out.println(name + " eats the steak in a hurry!");
    }

    public void roam(String name){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0){
            System.out.println(name + " roams his/her area.");
        }
        else if(rand_int == 1){
            System.out.println(name + " is lazy and refuses to roam.");
        }
        else{
            System.out.println(name + " roams a little and stopped.");
        }
    }
}
