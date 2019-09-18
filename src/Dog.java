//package src;

public class Dog extends Canine {
    private String dogName;

    // Constructors
    Dog(String name){
        this.dogName = name;
    }

    public String getName(){
      return this.dogName;
    }

    public void makeNoise(){
        System.out.println("Bark Bark!");
    }

    public void wakeUp(){
        System.out.println(this.dogName + " slowly opens his/her eyes and stretches.");
    }

}
