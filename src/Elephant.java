public class Elephant extends Pachyderm {
  private String EleName;
  // constructor
  Elephant(String name) {
    this.EleName = name;
  }
  // getter for runtime
  public String getName(){
    return this.EleName;
  }
  // makeNoise() and wakeUp() are implementations of superclass methods
  public String makeNoise() {
    return "Heah Heah!";
  }

  public String wakeUp(){
    return this.EleName + " slowly opens his/her eyes and stretches.";
  }
}
