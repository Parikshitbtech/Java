class Person{
    String name;
    int age;
    public void introduce() {
        System.out.println("Hi,my name is " + name + " and I am " + age + " years old.");
    }
}



public class Intro {
    public static void main(String[] args){
        Person ob = new Person();
        ob.name = "Parikshit Bhattacharya";
        ob.age = 19;
        ob.introduce();
    }

}
