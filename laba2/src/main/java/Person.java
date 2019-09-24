public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {

        if(!firstName.isEmpty() && firstName != null) {
            this.firstName = firstName;
        } else throw new IllegalArgumentException("Firstname is empty");

        if(!lastName.isEmpty() && lastName != null) {
            this.lastName = lastName;
        } else throw new IllegalArgumentException("Lastname is empty");

        if (age > 0) {
            this.age = age;
        } else throw new IllegalArgumentException("Age must be positive");

    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public final boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof Person)) return false;

        Person guest = (Person) obj;

        return (
                age == guest.age &&
                        (firstName == guest.firstName || (firstName != null && firstName.equals(guest.getFirstName()))) &&
                        (lastName == guest.lastName || (lastName != null && lastName .equals(guest.getLastName())))
        );
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + age;
        return result;
    }
}
