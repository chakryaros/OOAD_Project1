//package src;
import java.util.Random;

public class Cat extends Feline {

    private String catName;

    Cat(String name) {
      this.catName = name;
    }

    public String getName(){
      return this.catName;
    }

    public void makeNoise() {
      System.out.println("Meow Meow!");
    }

    public void wakeUp(){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0) {
            System.out.println(this.catName + " slowly opens his/her eyes and stretches.");
        }
        else if(rand_int == 1){
            System.out.println(this.catName + " wakes up angry because she didn't get enough sleep.");
        }
        else{
            System.out.println(this.catName + " wakes up crying because she had a nightmare.");
        }
    }

}
