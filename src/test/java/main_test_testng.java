import org.testng.Assert;
import org.testng.annotations.Test;

public class main_test_testng {

    @Test(groups = {"Imperio"})
    public void testConstructor() {
        Persona persona = new Persona("Anakin", "Skywalker");
        Assert.assertEquals(persona.getFullName(), "Anakin Skywalker");
    }

    @Test(groups = {"Republica"})
    public void testChangeName() {
        Persona persona = new Persona("Anakin", "Skywalker");
        persona.changeName("Darth");

        persona.getFullName();
        Assert.assertEquals(persona.getFullName(), "Darth Skywalker");
        //Assert.assertTrue(persona.getFullName().equals("Darth Skywalker"));
    }
}
