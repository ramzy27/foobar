package kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FooBarQixFormatterTest {

    FooBarQixFormatter fooBarQixCalculator;

    @Before
    public void init() {
        fooBarQixCalculator = new FooBarQixFormatter();
    }

    @Test
    public void should_return_same_int() {
        Assert.assertEquals("1", fooBarQixCalculator.formatFooBarQix(1));
    }

    @Test
    public void should_return_foo_when_divisible() {
        Assert.assertEquals("Foo", fooBarQixCalculator.formatFooBarQix(6));
    }

    @Test
    public void should_return_foo_when_contains() {
        Assert.assertEquals("Foo", fooBarQixCalculator.formatFooBarQix(13));
    }

    @Test
    public void should_return_foofoo_when_divisible_and_contains() {
        Assert.assertEquals("FooFoo", fooBarQixCalculator.formatFooBarQix(3));
    }
    @Test
    public void should_return_bar_when_divisible(){
        Assert.assertEquals("Bar",fooBarQixCalculator.formatFooBarQix(20));
    }

    @Test
    public void should_return_bar_when_contains(){
        Assert.assertEquals("Bar",fooBarQixCalculator.formatFooBarQix(52));
    }

    @Test
    public void should_return_barbar_wehndivisible_and_contains(){
        Assert.assertEquals("BarBar",fooBarQixCalculator.formatFooBarQix(5));
    }

    @Test
    public void should_return_qix(){
        Assert.assertEquals("Qix",fooBarQixCalculator.formatFooBarQix(7));
    }
    @Test
    public void should_apply_division_rules(){
        Assert.assertEquals("FooBar",fooBarQixCalculator.formatFooBarQix(51));
    }

    @Test
    public void should_apply_contains_rules(){
        Assert.assertEquals("BarFoo",fooBarQixCalculator.formatFooBarQix(53));
    }

}
