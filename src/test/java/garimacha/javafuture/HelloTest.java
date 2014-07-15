package garimacha.javafuture;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test of the Hello class.
 */
public class HelloTest {

    private Hello classUnderTest;

    @Before
    public void before() {
        classUnderTest = new Hello();
    }

    @Test
    public void returnsHelloWorld() {
        String expected = "Hello, World!";

        String actual = classUnderTest.greet();

        assertThat(actual).isEqualTo(expected);
    }
}
