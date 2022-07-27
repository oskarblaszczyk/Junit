package pl.kurs.array;

import org.junit.Test;


public class ArrayCountTest {



    @Test(expected = NullPointerException.class)
    public void shouldReturnIllegalArgumnetExceptionWhenArrayIsNull(){
        ArrayCount.getSumOfArray(null);
    }

}