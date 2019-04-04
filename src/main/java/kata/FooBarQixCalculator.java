package kata;

public class FooBarQixCalculator {


    public String calculateFooBarQix(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Foo");
        }
        if (String.valueOf(number).contains("3")) {
            result.append("Foo");
        }

        if (number % 5 == 0) {
            result.append("Bar");
        }
        if (String.valueOf(number).contains("5")) {
            result.append("Bar");
        }
        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }
        return result.toString();
    }

}
