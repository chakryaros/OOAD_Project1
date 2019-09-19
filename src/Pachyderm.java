//package src;
import java.util.Random;

public class Pachyderm extends Animals {

  Pachyderm(){
    // System.out.println("The Zookeeper tends to the Pachyderm side of the zoo");
  }

  public String roam(String name){
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

  public String eat(String name){
    return name + " eats the banana in a hurry!";
  }
}
