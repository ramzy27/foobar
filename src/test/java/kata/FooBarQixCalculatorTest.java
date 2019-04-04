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
        Assert.assertEquals("Foo", fooBarQixCalculator.calculateFooBarQix(6));
    }

    @Test
    public void should_return_foo_when_contains() {
        Assert.assertEquals("Foo", fooBarQixCalculator.calculateFooBarQix(13));
    }

    @Test
    public void should_return_foofoo_when_divisible_and_contains() {
        Assert.assertEquals("FooFoo", fooBarQixCalculator.calculateFooBarQix(3));
    }
    @Test
    public void should_return_bar_when_divisible(){
        Assert.assertEquals("Bar",fooBarQixCalculator.calculateFooBarQix(20));
    }

    @Test
    public void should_return_bar_when_contains(){
        Assert.assertEquals("Bar",fooBarQixCalculator.calculateFooBarQix(52));
    }

    @Test
    public void should_return_barbar_wehndivisible_and_contains(){
        Assert.assertEquals("BarBar",fooBarQixCalculator.calculateFooBarQix(5));
    }

    @Test
    public void should_return_qix(){
        Assert.assertEquals("Qix",fooBarQixCalculator.calculateFooBarQix(7));
    }
    @Test
    public void should_apply_division_rules(){
        Assert.assertEquals("FooBar",fooBarQixCalculator.calculateFooBarQix(51));
    }

}
