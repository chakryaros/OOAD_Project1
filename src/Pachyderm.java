//package src;
import java.util.Random;

public class Pachyderm extends Animals {

  Pachyderm(){
    // System.out.println("The Zookeeper tends to the Pachyderm side of the zoo");
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

  public void eat(String name){
    System.out.println(name + " eats the banana in a hurry!");
  }
}
