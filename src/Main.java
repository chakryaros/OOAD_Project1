//package src;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

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

      keeper.useFileWriter();

    }



}
