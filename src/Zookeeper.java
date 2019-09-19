import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Zookeeper extends Animals {

    private ArrayList<Animals> arr = new ArrayList<Animals>(); //Arraylist to contain Animal objects

    private ArrayList<String> res = new ArrayList<String>();    //output array

        // constructor, taking Animal objects already declared for use here
        Zookeeper(ArrayList<Animals> animals_array){
            this.arr = animals_array;
        }


        /*
         * callAnimals(), feedAnimals(), exerciseAnimals(), and shutdownZoo() all follow the logic of wakeAnimals()
         */
        public void wakeAnimals(){
            // add output to string array
            this.res.add("Time to Open the Zoo! Zookeeper starts to wake up all the animals.");
            // waking up all animals, adding output to string array
            for(int i = 0; i < this.arr.size(); i++){
                this.res.add(this.arr.get(i).wakeUp());
            }
            // seperating this set of outputs in the output.txt file
            this.res.add(System.getProperty( "line.separator" ));
        }

        // elicits noise from animals
        public void callAnimals(){
            this.res.add("To make sure everyone is here, Zookeeper starts to call all the animals.");

            for(int i = 0; i < this.arr.size(); i++){
                this.res.add(this.arr.get(i).makeNoise());
            }

            this.res.add(System.getProperty( "line.separator" ));
        }


        public void feedAnimals(){
            this.res.add("Can't start working when you are hungry, so Zookeeper starts to feed all the animals.");

            for(int i = 0; i < this.arr.size(); i++){
                String name = this.arr.get(i).getName();
                this.res.add(this.arr.get(i).eat(name));
            }

            this.res.add(System.getProperty( "line.separator" ));
        }

        public void exerciseAnimals(){
            this.res.add("Some animals are getting too heavy with all the good food! Zookeeper must make sure all the animals do some exercise after their meals.");

            for(int i = 0; i < this.arr.size(); i++){
                String name = this.arr.get(i).getName();
                this.res.add(this.arr.get(i).roam(name));
            }

            this.res.add(System.getProperty( "line.separator" ));
        }

        public void shutDownZoo(){
            this.res.add("Time for Closing! What a happy day! Zookeeper closes the doors and turns off the lights.");

            for(int i = 0; i < this.arr.size(); i++){
                String name = this.arr.get(i).getName();
                this.res.add(this.arr.get(i).sleep(name));
            }

            this.res.add(System.getProperty( "line.separator" ));
        }

        // function uses Java method fileWriter to insert each Zookeeper/Animal response to the output.txt file
        public void useFileWriter() throws IOException {
            // will need to set this path to the location of the project on machine
            FileWriter fileWriter = new FileWriter("C:/Users/warre/Documents/NetBeansProjects/Zoo2.0/OOAD_Project1/output.txt");
            // adding each entry into output.txt
            for(int i = 0; i < this.res.size(); i++){
                fileWriter.write(this.res.get(i));
                fileWriter.write(System.getProperty( "line.separator" ));
            }

            fileWriter.close();
        }


    // should work with some other animals in the zoo
}
