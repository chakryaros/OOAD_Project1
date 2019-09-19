//package src;

public class Lion extends Feline {

    private String LionName;

    Lion(String name) {
      this.LionName = name;
    }

    public String getName(){
      return this.LionName;
    }

    public String makeNoise() {
      return "Roar Roar!";
    }

    public String wakeUp(){
      return this.LionName + " slowly opens his/her eyes and stretches.";
    }

}
