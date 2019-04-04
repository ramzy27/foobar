package kata;

public enum Divisors{
    FOO("Foo", 3),
    BAR("Bar", 5);

    private String displayValue;
    private int value;

    Divisors(String displayValue, int value) {

        this.displayValue = displayValue;
        this.value = value;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public int getValue() {
        return value;
    }
}