//package src;

public class Cat extends Feline {

    private String catName;

    Cat(String name) {
      this.catName = name;
    }

    public String getName(){
      return this.catName;
    }

    public void makeNoise() {
      System.out.println("Meow Meow!");
    }

    public void wakeUp(){
      System.out.println(this.catName + " slowly opens his/her eyes and stretches.");
    }

}
