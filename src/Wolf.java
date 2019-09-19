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
    // makeNoise() and wakeUp() are implementations of superclass methods
    public String makeNoise(){
        return "Woof Woof!";
    }

    public String wakeUp(){
        return this.wolfName + " slowly opens his/her eyes and stretches.";
    }
}
