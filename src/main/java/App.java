import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        //5. В классе App, по аналогии, вызовите еще раз бин HelloWorld, затем 2 раза вызовите бин cat.
        // Сравните 2 пары бинов по ссылке и выведите результат в консоль.
        // Для пары HelloWorld должно вернуться true, для cat — false.
        // Так вы можете увидеть результат того, как работает наш контейнер.
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getMessage());

        System.out.println("Sravnenie HW");
        System.out.println(bean.equals(bean2));
        System.out.println("Sravnenie Cat");
        System.out.println(bean3.equals(bean4));
    }
}