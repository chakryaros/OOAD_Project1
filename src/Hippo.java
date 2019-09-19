//package src;

public class Hippo extends Pachyderm{
  private String HipName;

  Hippo(String name) {
    this.HipName = name;
  }

  public String getName(){
    return this.HipName;
  }

  public String makeNoise() {
    return "Wheez Wheez!";
  }

  public String wakeUp(){
    return this.HipName + " slowly opens his/her eyes and stretches.";
  }
}
