package kata;

public enum Containables{
    FOO("Foo", '3'),
    BAR("Bar", '5'),
    QIX("Qix",'7');

    private String displayValue;
    private char value;

    Containables(String displayValue, char value) {

        this.displayValue = displayValue;
        this.value = value;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public char getValue() {
        return value;
    }
}