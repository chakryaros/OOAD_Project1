import java.util.Random;
// subclass of Feline
public class Cat extends Feline {

    private String catName;

    // constructor
    Cat(String name) {
      this.catName = name;
    }

    // for runtime name retrieval, getter
    public String getName(){
      return this.catName;
    }

    public String makeNoise() {
      return "Meow Meow!";
    }

    // implementation of Animals object superclass wakeUp()
    public String wakeUp(){

        // another random output generator
        Random rand = new Random();
        int rand_int = rand.nextInt(3);

        if(rand_int == 0) {
            return this.catName + " slowly opens his/her eyes and stretches.";
        }
        else if(rand_int == 1){
            return this.catName + " wakes up angry because she didn't get enough sleep.";
        }
        else{
            return this.catName + " wakes up crying because she had a nightmare.";
        }
    }

}
