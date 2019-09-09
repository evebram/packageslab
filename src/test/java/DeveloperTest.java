import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Daniella", "JG789234", 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Daniella",developer.getName());
    }

    @Test
    public void hasNINo(){
        assertEquals("JG789234", developer.getNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000,0.1, developer.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        assertEquals(52500,0.1, developer.raiseSalary(1.5));
    }

    @Test
    public void testPayBonus(){
        assertEquals(350,0.1, developer.payBonus());
    }

}
