package kata;

import java.util.function.Function;

import static java.lang.Boolean.FALSE;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public enum TypeEnum {


    FOO("Foo", (i -> i % 3 == 0), (i -> i.equals('3'))),
    BAR("Bar", (i -> i % 5 == 0), (i -> i.equals('5'))),
    QIX("Qix", (i -> FALSE), (i -> i.equals('7')));

    private final String name;
    private Function<Integer, Boolean> divisionRule;
    private Function<Character, Boolean> containsRule;

    TypeEnum(String name, Function<Integer, Boolean> divisionRule, Function<Character, Boolean> containsRule) {
        this.name = name;
        this.divisionRule = divisionRule;
        this.containsRule = containsRule;
    }

    public static String applyDivisionRule(int i) {
        return stream(TypeEnum.values())
                .filter(type -> type.divisionRule.apply(i))
                .map(type -> type.name)
                .collect(joining());
    }

    public static String applyContainesRule(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        String stringNumber = String.valueOf(i);
        for (char c : stringNumber.toCharArray()) {
            for (TypeEnum typeEnum : TypeEnum.values()) {
                if (typeEnum.containsRule.apply(c)) {
                    stringBuilder.append(typeEnum.name);
                }
            }
        }
        return stringBuilder.toString();
    }
}
