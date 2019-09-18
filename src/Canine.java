//package src;

public class Canine extends Animals {
    Canine(){
      // System.out.println("The Zookeeper tends to the Canine side of the zoo");
    }

    public void eat(String name){
        System.out.println("The Zookeeper puts down a steak for "+ name);
        System.out.println(name + " eats the steak in a hurry!");
    }

    public void roam(String name){
      System.out.println(name + " roams his/her area.");
    }
}
