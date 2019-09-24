import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONTest {
    private static Gson gson;

    @BeforeAll
    public static void initialize() {
        gson = new Gson();
    }

    @Test
    public void test() {
        Person person1 = new Person("Vova", "Mazur", 19);

        String json = gson.toJson(person1);

        Person person2 = gson.fromJson(json, Person.class);

        assertTrue(person1.equals(person2));
        assertEquals(person1, person2);
    }

}