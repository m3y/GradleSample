package sample.gradle;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import mockit.Mocked;
import mockit.Expectations;

/**
 * Created by m3y on 2015/06/05.
 */
public class GradleMainTest {
    @Mocked private GradleMain gradleMain;

    @Test
    public void test() {
        // setup
        new Expectations() {{
            gradleMain.method(); result = "stub";
        }};

        // exercise
        String actual = gradleMain.method();

        // verfiy
        assertThat(actual, is("stub"));
    }
}
