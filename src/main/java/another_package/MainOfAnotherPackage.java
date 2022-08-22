package another_package;

import main_package.Rect;

public class MainOfAnotherPackage {

    public static void main(String[] args) {
    Person personJohn = new Person("John", "Snow");
        System.out.println(personJohn.getName());
    Person personKate = new Person("Kate", "Ali");
        System.out.println(personKate.getName()+" "+ personKate.getSurname());
    personJohn.sayHi();
    personKate.sayHi();
    personJohn.setAge(42);
    personKate.sayHelloByName(personJohn);
    personJohn.sayHelloByName(personKate);
    personKate.askPerson(personJohn);
    personKate.replyByPerson(personJohn);
    Person personJeff = new Person("Jeff", "Limm");
    personJeff.sayHelloByName(personKate, personJohn);
    personJeff.sayHelloByNameAndSurname(personKate, personJohn);
    }
}
