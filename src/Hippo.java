
// subclass of Pachyderm
public class Hippo extends Pachyderm{
  private String HipName;
  // constructor
  Hippo(String name) {
    this.HipName = name;
  }

  public String getName(){
    return this.HipName;
  }

  // implementations of superclass methods, makeNoise() and wakeUp()
  public String makeNoise() {
    return "Wheez Wheez!";
  }

  public String wakeUp(){
    return this.HipName + " slowly opens his/her eyes and stretches.";
  }
}
