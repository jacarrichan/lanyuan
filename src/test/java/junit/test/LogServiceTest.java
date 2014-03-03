package junit.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lanyuan.service.LogService;

public class LogServiceTest extends BaseTest {
	@Autowired
	private LogService logService;

	@Test
	public void testGetById() {
		logService.getById("1");
	}
}
