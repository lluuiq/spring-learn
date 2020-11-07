import com.lu.pojo.User;
import com.lu.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("abc");
        UserT userT = (UserT) context.getBean("userTwo");
        user.show();
        userT.show();
    }
}
