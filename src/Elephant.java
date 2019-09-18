//package src;

public class Elephant extends Pachyderm {
  private String EleName;

  Elephant(String name) {
    this.EleName = name;
  }

  public String getName(){
    return this.EleName;
  }

  public void makeNoise() {
    System.out.println("Heah Heah!");
  }

  public void wakeUp(){
    System.out.println(this.EleName + " slowly opens his/her eyes and stretches.");
  }
}
