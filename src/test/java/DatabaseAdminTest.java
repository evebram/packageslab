import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Fidelma", "JD765432", 37000);
    }

    @Test
    public void hasName(){
        assertEquals("Fidelma", databaseAdmin.getName());
    }

    @Test
    public void hasNINo(){
        assertEquals("JD765432", databaseAdmin.getNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(37000,0.1, databaseAdmin.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        assertEquals(55500,0.1, databaseAdmin.raiseSalary(1.5));
    }

    @Test
    public void testPayBonus(){
        assertEquals(370,0.1, databaseAdmin.payBonus());
    }

}
