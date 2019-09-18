package src;

public class Hippo extends Pachyderm{
  private String HipName;

  Hippo(String name) {
    this.HipName = name;
  }

  public String getName(){
    return this.HipName;
  }

  public void makeNoise() {
    System.out.println("Wheez Wheez!");
  }

  public void wakeUp(){
    System.out.println(this.HipName + " slowly opens his/her eyes and stretches.");
  }
}
