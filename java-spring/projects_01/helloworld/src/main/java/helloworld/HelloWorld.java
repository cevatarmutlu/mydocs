package helloworld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        MessageProvider mp = new MessageProviderImplementation();
        MessageRenderer mr = new MessageRendereImplementation();
        mr.setMessageProvider(mp);
        mr.render();
        /**
         * Yukarıdaki örnekte HelloWorld class' ımızı iki tane class' a bağımlıdır.
         * Loose coupling (Zayıf Bağımlılık) denen olay önemli bir şeydir.
         * Spring framework' ü bu bağımlılıkları azaltır.
         */
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")) {
            mr = applicationContext.getBean("renderer", MessageRendereImplementation.class);
            // mr = applicationContext.getBean("renderer", MessageRenderer.class);
            mr.render();


        } catch (Exception e) {
            //TODO: handle exception
            System.err.println("Bir hata meydana geldi! Hata: " + e);
        }
    }
}
