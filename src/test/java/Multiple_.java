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
    

}
