//package src;
import java.io.IOException;
import java.util.*;

public class Main {
    // error catching with IOException
    public static void main(String[] args) throws IOException {

      // Arraylist for animals declared below
      ArrayList<Animals> arr = new ArrayList<Animals>();

      // polymorhphic declarations. Animals has an object of ...
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

      // Zookeeper to interact with Animals
      Zookeeper keeper = new Zookeeper(arr);

      // function calls where zookeeper will interact with animals
      keeper.wakeAnimals();
      keeper.callAnimals();
      keeper.feedAnimals();
      keeper.exerciseAnimals();
      keeper.shutDownZoo();

      // Java object to write strings to output file (output.txt)
      keeper.useFileWriter();

    }



}
