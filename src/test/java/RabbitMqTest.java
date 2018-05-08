import com.demo.Application;
import com.demo.sender.HelloSender;
import com.demo.sender.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuwei
 * @date 2018/5/7 15:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RabbitMqTest {
    @Autowired
    private HelloSender helloSender;
    @Autowired
    private TopicSender topicSender;

    @Test
    public void hello() {
        helloSender.send();
    }

    @Test
    public void sendNews() {
        topicSender.sendNews();
    }

    @Test
    public void sendWeather() {
        topicSender.sendWeather();
    }
}
