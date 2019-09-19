//package src;

public class Elephant extends Pachyderm {
  private String EleName;

  Elephant(String name) {
    this.EleName = name;
  }

  public String getName(){
    return this.EleName;
  }

  public String makeNoise() {
    return "Heah Heah!";
  }

  public String wakeUp(){
    return this.EleName + " slowly opens his/her eyes and stretches.";
  }
}
