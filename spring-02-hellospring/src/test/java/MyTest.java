import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象都在Spring中管理，我们要使用的话 直接去里面取出来即可.
        // .getBean("beans.xml里定义的ID")
        Object hello = context.getBean("hello");
        System.out.println(hello.toString());
    }
}
