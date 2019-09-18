//package src;
import java.util.Random;

public class Animals {

    Animals(){

    }

    public void sleep(String name){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0) {
            System.out.println(name + " falls asleep.");
        }
        else if(rand_int == 1){
            System.out.println(name + " refuses to go to sleep and plays in the dark.");
        }
        else{
            System.out.println(name + " lies down but hasn't fall asleep yet.");
        }
    }

    public void wakeUp() {
        System.out.println("...");
    }

    public void makeNoise() {
        System.out.println("...");
    }

    public void eat(String name) {
        System.out.println("...");
    }

    public void roam(String name) {
        System.out.println("...");
    }

    public String getName(){
       return "..";
    }
}

