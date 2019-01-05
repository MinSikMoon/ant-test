package web.studyclub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//spring context는 재사용된다.
//메서드 실행후에 다음 테스트 실행 전에 컨텍스트 초기화 하려면 @DirtiesContext를 쓴다. 
//클래스 별로 context를 재사용하기 싫다면
//DirtiesContext(classMode = ClassMode.AFTER_CLASS)
@DirtiesContext(classMode=ClassMode.AFTER_CLASS)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:mvc-quick-start.xml"})
public class CalcTest {
    @Autowired
    Calculator calculator;
    @Test
    public void sumTest(){
        assertEquals(calculator.sum(1, 2), 3);
    }
    @Test
    public void sumTest6(){
        assertEquals(calculator.sum(4, 2), 6);
    }
}