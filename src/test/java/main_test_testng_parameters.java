import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class main_test_testng_parameters
{
    @Parameters({"firstName"})
    @Test
    public void testConstructor (String firstName){

        System.out.println("Mi nombre es: " + firstName);
        Persona persona  =  new Persona(firstName, "Tano");
        Assert.assertEquals(persona.getFullName(), "Asoka Tano");
    }
}
