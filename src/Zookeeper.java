package src;

public class Zookeeper{

    private Animals array[]; //in driver class Zoo?

    Zookeeper(Animals animals_array){
        this.array = animals_array;
    }

    public void wakeAnimals(this.array){
      for(int i = 0; i < len(Animals_array); i++){
        Animals_array[i].wakeUp();
      }
    }

    public void callAnimals(this.array){
      for(int i = 0; i < len(Animals_array); i++){
        Animals_array[i].makeNoise();
      }
    }

    public void feedAnimals(this.array){
      for(int i = 0; i < len(Animals_array); i++){
        name = Animals_array[i].getName();
        Animals_array[i].eat(name);
      }
    }

    public void exerciseAnimals(this.array){
      for(int i = 0; i < len(Animals_array); i++){
        name = Animals_array[i].getName();
        Animals_array[i].roam(name);
      }
    }

    public void shutDownZoo(this.array){
      for(int i = 0; i < len(Animals_array); i++){
        name = Animals_array[i].getName();
        Animals_array[i].sleep(name);
      }
    }


    // should work with some other animals in the zoo
}
