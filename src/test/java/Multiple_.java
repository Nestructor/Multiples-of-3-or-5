import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Multiple_ {

    private Multiple multiple;

    @Before
    public void setUp() {
        multiple = new Multiple();
    }

    @Test
    public void given_negative_number_should_return_0() {
        assertThat(multiple.of(-1)).isEqualTo(0);
    }

    @Test
    public void given_3_should_return_0() {
        assertThat(multiple.of(3)).isEqualTo(0);
    }

    @Test
    public void given_4_should_return_3() {
        assertThat(multiple.of(4)).isEqualTo(3);
    }

    @Test
    public void given_10_should_return_23() {
        assertThat(multiple.of(10)).isEqualTo(23);
    }


    @Test
    public void given_16_should_return_50() {
        assertThat(multiple.of(16)).isEqualTo(60);
    }


}
