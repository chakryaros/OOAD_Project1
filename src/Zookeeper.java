package src;

public class Zookeeper{
    
    private String Name;
    private int Age;
    Zookeeper(String ZookeeperName, int ZookeeperAge){
        this.Age = ZookeeperAge;
        this.Name = ZookeeperName;
    }
    
    public void workWithDogs(String Name, int Age){
    Dog d = new Dog(Name, Age);
    d.wakeUp();
    d.makeNoise();
    d.eat();
    d.roam();
    d.sleep();
    }
    
    public void workWithCoyotes(String Name, int Age){
    Coyote c = new Coyote(Name, Age);
    c.wakeUp();
    c.makeNoise();
    c.eat();
    c.roam();
    c.sleep();
    }
    
    // should work with some other animals in the zoo
}
