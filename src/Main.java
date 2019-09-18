//package src;
import java.util.*;

public class Main {

    public static void main(String[] args) {

      ArrayList<Animals> arr = new ArrayList<Animals>();

      Animals c = new Cat("Cathy");
      arr.add(c);
      Animals l = new Lion("Leon");
      arr.add(l);
      Animals w = new Wolf ("Warren");
      arr.add(w);
      Animals d = new Dog("Daniel");
      arr.add(d);
      Animals h = new Hippo("Harry");
      arr.add(h);
      Animals e = new Elephant("Eva");
      arr.add(e);

      Zookeeper keeper = new Zookeeper(arr);

      keeper.wakeAnimals();
      keeper.callAnimals();
      keeper.feedAnimals();
      keeper.exerciseAnimals();
      keeper.shutDownZoo();


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
//        Zookeeper zk = new Zookeeper("Zelda", 39);
//        zk.workWithDogs("Daniel", 2);
//
//        zk.workWithCoyotes("Carl", 3);
    }



}
