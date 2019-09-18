import java.util.*;
import java.util.ArrayList;
//package src;


public class Zookeeper extends Animals {

    private ArrayList<Animals> arr = new ArrayList<Animals>(); //in driver class Zoo?

    Zookeeper(ArrayList<Animals> animals_array){
        this.arr = animals_array;
    }

    public void wakeAnimals(){
        System.out.println("Time to Open the Zoo! Zookeeper starts to wake up all the animals.");

      for(int i = 0; i < this.arr.size(); i++){
        this.arr.get(i).wakeUp();
      }
    }

    public void callAnimals(){
        System.out.println("To make sure everyone is here, Zookeeper starts to call all the animals.");

      for(int i = 0; i < this.arr.size(); i++){
          this.arr.get(i).makeNoise();
      }
    }

    public void feedAnimals(){
        System.out.println("Can't start working when you are hungry, so Zookeeper starts to feed all the animals.");

      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).eat(name);
      }
    }

    public void exerciseAnimals(){
        System.out.println("Some animals are getting too heavy with all the good food! Zookeeper must make sure all the animals do some exercise after their meals.");

      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).roam(name);
      }
    }

    public void shutDownZoo(){
        System.out.println("Time to Close the Zoo! What a happy day! Zookeeper closes the doors and turns off the lights.");

      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).sleep(name);
      }
    }


    // should work with some other animals in the zoo
}
