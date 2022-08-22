package another_package;


public class Person {

    private String name;
    private String surname;

    private int age;

    private String email;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void sayHi(){
        System.out.println("Hi! My name is  " + this.name);
    }

    public void sayHelloByName (Person personToWhom){
        System.out.println("Hello, " + personToWhom.getName());
    }
    public void sayHelloByName (Person person1, Person person2) {
        System.out.println ("Hello " + person1.name + " and " + person2.name);
    }

    public void sayHelloByNameAndSurname (Person personToWhom1, Person personToWhom2) {
        System.out.println("Hello, " + personToWhom1.name + " " + personToWhom1.surname + " and " + personToWhom2.name + " " + personToWhom1.surname);
    }



    public void askPerson (Person person) {
        System.out.println("How old are your, "+ person.getName()+"?");
    }

    public void replyByPerson (Person person) {
        System.out.println("I am " + person.getAge() + " years old");
    }

}
