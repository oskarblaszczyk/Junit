package pl.kurs.company;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.kurs.worker.Worker;

import static org.junit.Assert.*;


public class CompanyTest {

    private static Worker w1;
    private static Worker w2;
    private static Company c1;
    private static Company c2;

    @BeforeClass
    public static void init() {
        c1 = new Company("Zxcc");
        c2 = new Company("Pola");
        w1 = new Worker("Asdf", "Asdf", 4500.0, c1);
        w2 = new Worker("12", "Asdf", 4500.0, c2);
        //w1.setCompany(c2);
    }


    @Test (expected = IllegalArgumentException.class)
    public void shouldReturnIllegalArgumentExceptionWhenNameIsWrong(){
        new Company("A");
    }

    @Test
    public void isCompanyWorkerListIsValid(){
        for(Worker w : c1.getWorkerList()){
            if(!w.getCompany().getName().equals(c1.getName())){
                fail();
            }
            assertTrue(true);
        }
    }

    @Test
    public void isCompanyExtensionsValid(){
        assertEquals(2, Company.getCompanyExtension().size());
    }


    @Test
    public void isSumOfSalaryValid(){
        assertEquals(5000.0, Company.getSumOfSalaries(c1), 0.01);
    }

    // sum 20k -
}