package src;

public class Lion extends Feline {
    private String LionName;

    Cat(String name) {
      this.LionName = name;
    }

    public String getName(){
      return this.LionName;
    }

    public void makeNoise() {
      System.out.println("Roar Roar!");
    }

    public void wakeUp(){
      System.out.println(this.LionName + " slowly opens his/her eyes and stretches.");
    }

}
