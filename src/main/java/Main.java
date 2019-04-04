import kata.FooBarQixFormatter;

import java.util.stream.IntStream;

public class Main {

    public static void main(String [] args){
        final FooBarQixFormatter fooBarQixFormatter =new FooBarQixFormatter();
        IntStream.rangeClosed(1,100).forEach(number->System.out.println(fooBarQixFormatter.formatFooBarQix(number)));
    }
}
