// subclass of Feline
public class Lion extends Feline {

    private String LionName;
    // constructor
    Lion(String name) {
      this.LionName = name;
    }

    public String getName(){
      return this.LionName;
    }
    // makeNoise() and wakeUp() are implementations of superclass methods
    public String makeNoise() {
      return "Roar Roar!";
    }

    public String wakeUp(){
      return this.LionName + " slowly opens his/her eyes and stretches.";
    }

}
