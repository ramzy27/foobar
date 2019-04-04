package kata;

public class FooBarQixCalculator {


    public String calculateFooBarQix(int number) {
        if(number % 3  == 0){
            return "Foo";
        }
        if(String.valueOf(number).contains("3")){
            return "Foo";
        }
        return String.valueOf(number);
    }

}
