package com.devy.dummy;

import com.devy.dummy.instance.TestInstance;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("인스턴스 생성 여부 확인")
    void testToMakeInstance() throws Exception {
        DummyUtils dummyUtils = new DummyUtils();

        TestInstance instance = dummyUtils.fill(TestInstance.class);

        assertThat(instance).isNotNull();
    }

}
