public class Main {
    public static void main(String[] args) {

        Person[] person = {
                new Programmer(),
                new Dancer(),
                new Singer()};
        for (Person person1: person){
            person1.walk();
        }


    }
}