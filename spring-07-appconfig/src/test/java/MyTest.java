import com.lu.config.LuConfig;
import com.lu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用配置类，则要使用 AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(LuConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
