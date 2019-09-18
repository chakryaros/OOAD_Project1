//package src;

public class Wolf extends Canine{
    private String wolfName;

    // Constructors
    Wolf(String name){
        this.wolfName = name;
    }

    public String getName(){
      return this.wolfName;
    }

    public void makeNoise(){
        System.out.println("Woof Woof!");
    }

    public void wakeUp(){
        System.out.println(this.wolfName + " slowly opens his/her eyes and stretches.");
    }
}
