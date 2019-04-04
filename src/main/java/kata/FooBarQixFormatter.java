package kata;

public class FooBarQixFormatter {


    public String formatFooBarQix(int number) {
        StringBuilder result = new StringBuilder();
        result.append(TypeEnum.applyDivisionRule(number));
        result.append(TypeEnum.applyContainesRule(number));
        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }
        return result.toString();
    }





}

