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

    public String makeNoise(){
        return "Woof Woof!";
    }

    public String wakeUp(){
        return this.wolfName + " slowly opens his/her eyes and stretches.";
    }
}
