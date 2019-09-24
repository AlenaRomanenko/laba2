import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.*;

import static org.junit.jupiter.api.Assertions.*;

class EqualTest {

    @Test
    public void successfulEquals() {
        Person p1 = new Person("Vova", "Mazur", 12);
        Person p2 = new Person("Vova", "Mazur", 12);

        assertTrue(p1.equals(p2));
    }

    @Test
    public void unsuccessfulEquals() {
        Person p1 = new Person("Vova", "Mazur", 12);
        Person p2 = new Person("Dima", "Mazur", 12);

        assertFalse(p1.equals(p2));
    }

    @Test
    public void symmetryTest() {
        Person p1 = new Person("Vova", "Mazur", 12);
        Person p2 = new Person("Vova", "Mazur", 12);

        assertEquals(p1, p2);
        assertEquals(p2, p1);
    }

    @Test
    public void equalsverifier() {
        EqualsVerifier.forClass(Person.class).verify();
    }

}