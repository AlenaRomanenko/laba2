import static org.junit.Assert.*;
import nl.jqno.equalsverifier.*;

public class PersonTest {

    @org.junit.Test
    public void equals1() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}