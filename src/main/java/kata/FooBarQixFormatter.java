package kata;

public class FooBarQixFormatter {


    public String formatFooBarQix(int number) {
        StringBuilder result = new StringBuilder();
        applyDivisors(number, result);
        applyContains(number, result);
        return result.toString();
    }


    private void applyDivisors(int number, StringBuilder result) {
        for (Divisors divisorEnum : Divisors.values())
            if (number % divisorEnum.getValue() == 0) {
                result.append(divisorEnum.getDisplayValue());
            }
    }

    private void applyContains(int number, StringBuilder result) {
        if (String.valueOf(number).contains("3")) {
            result.append("Foo");
        }

        if (String.valueOf(number).contains("5")) {
            result.append("Bar");
        }

        if (String.valueOf(number).contains("7")) {
            result.append("Qix");
        }
        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }
    }

}
