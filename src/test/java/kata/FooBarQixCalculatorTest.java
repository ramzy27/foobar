package kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FooBarQixCalculatorTest {

    FooBarQixCalculator fooBarQixCalculator;

    @Before
    public void init() {
        fooBarQixCalculator = new FooBarQixCalculator();
    }

    @Test
    public void should_return_same_int() {
        Assert.assertEquals("1", fooBarQixCalculator.calculateFooBarQix(1));
    }

    @Test
    public void should_return_foo_when_divisible() {
        Assert.assertEquals("Foo",fooBarQixCalculator.calculateFooBarQix(6));
    }


}
