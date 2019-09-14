public class Cat extends Feline {

    private String catName;
    private int age;

    Cat(String name, int age) {
        this.catName = name;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("meo meo!!!");
    }

    public void displayName(){
        System.out.println("This animal's name : " + this.catName);
        System.out.println(this.catName + " is " + this.age + " years old.");
    }
}




