package src;

public class Feline extends Animals {

    Feline(){
      // System.out.println("The Zookeeper tends to the Feline side of the zoo");
    }

    public void roam(String name){
      System.out.println(name + " roams his/her area.");
    }

    public void eat(String name){
      System.out.println(name + " eats the fish in a hurry!");
    }
}
