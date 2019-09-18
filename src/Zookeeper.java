import java.util.*;
import java.util.ArrayList;
//package src;


public class Zookeeper extends Animals {

    private ArrayList<Animals> arr = new ArrayList<Animals>(); //in driver class Zoo?

    Zookeeper(ArrayList<Animals> animals_array){
        this.arr = animals_array;
    }

    public void wakeAnimals(){
      for(int i = 0; i < this.arr.size(); i++){
        this.arr.get(i).wakeUp();
      }
    }

    public void callAnimals(){
      for(int i = 0; i < this.arr.size(); i++){
          this.arr.get(i).makeNoise();
      }
    }

    public void feedAnimals(){
      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).eat(name);
      }
    }

    public void exerciseAnimals(){
      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).roam(name);
      }
    }

    public void shutDownZoo(){
      for(int i = 0; i < this.arr.size(); i++){
        String name = this.arr.get(i).getName();
          this.arr.get(i).sleep(name);
      }
    }


    // should work with some other animals in the zoo
}
