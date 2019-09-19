import java.util.Random;
// 1st tier subclass (of Animals)
public class Pachyderm extends Animals {

  Pachyderm(){
  }
  // implementation of roam() superclass method
  public String roam(String name){
    // random output generator
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
  // implementation of eat()
  public String eat(String name){
    return name + " eats the banana in a hurry!";
  }
}
