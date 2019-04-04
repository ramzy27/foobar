package kata;

public class FooBarQixFormatter {


    public String formatFooBarQix(int number) {
        StringBuilder result = new StringBuilder();
        applyDivisors(number, result);
        applyContains(number, result);
        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }
        return result.toString();
    }


    private void applyDivisors(int number, StringBuilder result) {
        for (Divisors divisorEnum : Divisors.values())
            if (number % divisorEnum.getValue() == 0) {
                result.append(divisorEnum.getDisplayValue());
            }
    }

    private void applyContains(int number, StringBuilder result) {
        String stringNumber = String.valueOf(number);
        for (char c : stringNumber.toCharArray()) {
            for (Containables containsEnum : Containables.values()) {
                if (c == containsEnum.getValue()) {
                    result.append(containsEnum.getDisplayValue());
                }
            }
        }
    }

}

