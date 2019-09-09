import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Kasia", "JD123345", 45000, "Everything", 100000);

    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Everything", director.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Kasia",director.getName());
    }

    @Test
    public void hasNINo(){
        assertEquals("JD123345", director.getNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000,0.1, director.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        assertEquals(67500,0.1, director.raiseSalary(1.5));
    }

    @Test
    public void testPayBonus(){
        assertEquals(450,0.1, director.payBonus());
    }

    @Test
    public void testGetBudget(){
        assertEquals(100000, 0.1, director.getBudget());
    }

}
