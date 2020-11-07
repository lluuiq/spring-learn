import com.lu.dao.UserDaoImpl;
import com.lu.dao.UserDaoMysqlImpl;
import com.lu.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 需要什么就直接get

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
