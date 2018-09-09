package ru.marksblog;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.marksblog.service.AdService;

@ComponentScan("ru.marksblog")
public class AppTest {

    @Test
    public void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AdService ser = context.getBean(AdService.class);
        /*Company company = new Company();
        company.setId(1);
        ser.persist(company);
        System.out.println(ser.findById(1).getId());
        ser.deleteById(1);*/
      /*  Ad ad = new Ad();
        ad.setId(2);
        ad.setAdname("hello");
        ad.setCategory("1");
        ser.persist(ad);
        Ad ad2 = new Ad();
        ad2.setId(3);
        ad2.setAdname("hello");
        ad2.setCategory("1");
        ser.persist(ad2);*/
        ser.getAllByCategory("1");
        // ser.updateById(1, "bye");
    }
}
