package com.devy.dummy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class FillDummyValueApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void getTest() {
        assertThat("hello world").isEqualTo("hello world");
    }
}
