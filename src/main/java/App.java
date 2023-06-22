import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Эти бины равны? -" + (bean1 == bean2));

        Cat cat1 =(Cat) applicationContext.getBean("cat");
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Эти бины равны? -" + (cat1 == cat2));
    }
}