package web.studyclub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/mvc-quick-start.xml")
public class ControllerTest {

    @Test
    public void test1() {
        System.out.println("hihihih");
    }

}
