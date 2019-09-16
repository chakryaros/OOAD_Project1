package src;

public class Dog extends Canine {
    private String dogName;
    private int dogAge;
    
    // Constructors
    Dog(){
        
    }
    Dog(String Name, int Age){
        this.dogName = Name;
        this.dogAge = Age;
    }
    
    public void makeNoise(){
        System.out.println("Bark Bark!");
    }
    
    public void upsetAnimal(){
        System.out.println("The Zookeeper upset the dog!");
        super.Growl();
    }
    
    public void displayName(){
        System.out.println("This dog's name is : " + this.dogName);
        System.out.println(this.dogName + " is " + this.dogAge + " years old.");
    }
    
    public void wakeUp(){
        System.out.println("The Zookeeper wakes " + this.dogName);
        System.out.println(this.dogName + " slowly opens his/her eyes and stretches.");
    }
    
    public void eat(){
        System.out.println("The Zookeeper puts down a steak for "+ this.dogName);
        System.out.println(this.dogName + " eats the steak in a hurry!");
    }
    
    public void roam(){
        System.out.println("As the Zookeeper tends to other matters, " + this.dogName + " roams his/her area.");
    }
    
    public void sleep(){
        System.out.println("The Zookeeper turns off the lights in the dog area");
        System.out.println(this.dogName + " falls asleep.");
    }
    
}
