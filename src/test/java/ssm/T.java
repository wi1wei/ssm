package ssm;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-dao.xml", "classpath:spring-context.xml" })
public class T {
	@Resource
	private TestService t;

	@Test
	public void test() {
		System.out.println(t.getAll().size());
	}
}
