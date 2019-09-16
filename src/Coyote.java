package src;

public class Coyote extends Canine{
    private String coyoteName;
    private int coyoteAge;
    
    
    // Constructors
    Coyote(){
        //default
    }
    Coyote(String Name, int Age){
        this.coyoteName = Name;
        this.coyoteAge = Age;
    }
    
    public void makeNoise(){
        System.out.println("Woof Woof!");
    }
    
    public void upsetAnimal(){
        System.out.println("The Zookeeper upset the coyote!");
        super.Growl();
    }
    
    public void displayName(){
        System.out.println("This coyote's name is : " + this.coyoteName);
        System.out.println(this.coyoteName + " is " + this.coyoteAge + " years old.");
    }
    
    public void wakeUp(){
        System.out.println("The Zookeeper wakes " + this.coyoteName);
        System.out.println(this.coyoteName + " slowly opens his/her eyes and stretches.");
    }
    
    public void eat(){
        System.out.println("The Zookeeper puts down a chicken breast for "+ this.coyoteName);
        System.out.println(this.coyoteName + " eats the steak in a hurry!");
    }
    
    public void roam(){
        System.out.println("As the Zookeeper tends to other matters, " + this.coyoteName + " roams his/her area.");
    }
    
    public void sleep(){
        System.out.println("The Zookeeper turns off the lights in the Coyote area");
        System.out.println(this.coyoteName + " falls asleep.");
    }
}
