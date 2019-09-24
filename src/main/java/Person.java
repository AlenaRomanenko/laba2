import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.Objects;

final public class Person {
    private String LastName;
    private  String FirstName;
    private LocalDate birthdate;

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(LastName, person.LastName) &&
                Objects.equals(FirstName, person.FirstName) &&
                Objects.equals(birthdate, person.birthdate);
    }
   @Override
    public int hashCode() {
        return Objects.hash(LastName, FirstName, birthdate);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Romanenko");
        person.setLastName("Olena");
        Gson gson = new Gson();
        String JSON  = gson.toJson(person);
        Person person2 = gson.fromJson(JSON, Person.class);
        System.out.println(JSON);
       // System.out.println(person2);
    }



}

