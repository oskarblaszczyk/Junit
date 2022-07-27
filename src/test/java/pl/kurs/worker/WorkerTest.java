package pl.kurs.worker;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.kurs.company.Company;

import static org.junit.Assert.*;

public class WorkerTest {

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
    }

    @Test
    public void shouldReturnTrueWhenNameIsCorrect(){
        assertTrue(Worker.isNameCorrect(w1.getName()));
    }
    @Test
    public void shouldReturnFalseWhenNameIsIncorrect(){
        assertFalse(Worker.isNameCorrect("1234"));
    }

    @Test
    public void shouldSalaryBeSameAsIncome() {
        double income = 5000;
        assertEquals(w1.getSalary(), income, 0.01);
    }

    @Test
    public void isWorkersExtensionsValid(){
        assertEquals(2, Worker.getWorkerExtension().size());
    }

    @Test
    public void isCalculatedSalaryValid(){
       assertEquals(5000.0, w1.getSalary(), 0.01);
    }



}