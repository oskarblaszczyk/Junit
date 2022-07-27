package pl.kurs.array;

public class ArrayCount {

    // napisz metody które
    // sumuja tablice liczb
    // licza iloczyn tablicy liczb
    // obsluz przypadki gdy tablica jest nullem
    public static int getSumOfArray(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Tablica jest nullem");
        }
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        return sum;

    }

    public int getProductOfMultiplicationNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Tablica jest nullem");
        }
        int multiplication = 1;
        for (Integer i : numbers) {
            multiplication *= i;
        }
        return multiplication;
    }
}
