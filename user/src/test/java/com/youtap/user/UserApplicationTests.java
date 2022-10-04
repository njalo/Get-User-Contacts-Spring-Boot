package com.youtap.user;

import com.youtap.user.controllers.UserControllerTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({UserControllerTest.class})
class UserApplicationTests {

	@Test
	void contextLoads() {
	}

}
