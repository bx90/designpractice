package builder;

/**
 * Motivation:
 * - there would be lots of parameters in the constructor  ~ hard to follow
 * Hard not to confuse parameters !!!
 * ~ setters are the same, not the best solution
 * <p>
 * - not extensible: when we have to add one more optional parameters, we have to create a new constructor
 * Telescoping constructors appear !!!
 * With a builder --> we just add another method
 * <p>
 * - immutable property: we should consider parallel execution
 * The best is to use objects that can not be modified after they have been created
 * "immutable objects"
 * ~ so there will not be any problems because of concurrent updates by
 * multiple threads
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder()
                                  .name("A")
                                  .age(3)
                                  .email("@google.com")
                                  .build();

        System.out.println(person.toString());
    }
}
