package junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:spring-application.xml", "classpath:spring-security.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {
	@Before
	public void init() {
		System.out.println("unit test init");
	}

	@Test
	public void test() {
		System.out.println("unit test");
	}

	@After
	public void destory() {
		System.out.println("after unit test ");
	}

}
