import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class Multiple_ {

    private Multiple multiple = new Multiple();
    private final int number;
    private final int value;

    public Multiple_(int number, int value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute() {
        assertThat(multiple.of(number)).isEqualTo(value);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {-1, 0},
                {3, 0},
                {4, 3},
                {10, 23},
                {16, 60},
        };
    }

}
