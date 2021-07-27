import org.junit.Assert;
import org.junit.Test;

    public class main_test_junit {

        @Test
        public void testConstructor() {
            Persona persona = new Persona("Anakin", "Skywalker");
            Assert.assertEquals("Anakin Skywalker", persona.getFullName()); //para verificar
        }

        @Test
        public void testChangeName() {
            Persona persona = new Persona("Anakin", "Skywalker");
            persona.changeName("Darth");
            persona.getFullName();
            Assert.assertEquals("Darth Skywalker", persona.getFullName());
        }


    }
