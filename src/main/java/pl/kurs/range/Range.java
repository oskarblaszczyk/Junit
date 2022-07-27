package pl.kurs.range;

public class Range {
    private int rangeFrom;
    private int rangeTo;

    public Range(int rangeFrom, int rangeTo) {
        if (rangeFrom > rangeTo) {
            throw new IllegalArgumentException("incorrect range");
        }
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public boolean isInTheRange(int i) {
        return i >= rangeFrom && i <= rangeTo;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }
}
