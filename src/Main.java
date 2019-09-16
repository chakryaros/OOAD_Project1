package src;

public class Main {

    public static void main(String[] args) {

        // cat test
        /*
        Animals c = new Cat("Catty", 2);
        c.sleep();
        c.displayName();
        c.makeNoise();
        */
        
        // dog test
        /*
        Dog dog = new Dog("Daniel", 3);
        dog.displayName();
        dog.makeNoise();
//        dog.Sleep();
        */

        // Coyote Test
        /* 
        Coyote coy = new Coyote("Carl", 7);
        coy.displayName();
        coy.makeNoise();
        coy.coyoteSprint();
        */ 
        
        // Zookeeper Interaction Test
        // This will be the primary way of calling animal methods
        Zookeeper zk = new Zookeeper("Zelda", 39);
        zk.workWithDogs("Daniel", 2);
        
        zk.workWithCoyotes("Carl", 3);
    }



}
