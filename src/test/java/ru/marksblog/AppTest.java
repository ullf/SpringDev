package ru.marksblog;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.marksblog.model.Ad;
import ru.marksblog.model.Company;
import ru.marksblog.service.AdService;
import ru.marksblog.service.CompanyService;

@ComponentScan("ru.marksblog")
public class AppTest {

    @Test
    public void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AdService ser = context.getBean(AdService.class);
        CompanyService com = context.getBean(CompanyService.class);
        Company company = new Company();
        company.setId(1);
        ser.persist(company);
        System.out.println(com.findById(1).getId());
        com.deleteById(1);
        Ad ad = new Ad();
        ad.setId(1);
        ad.setAdname("hello");
        ad.setCategory("1");
        ser.persist(ad);
        ser.getAllByCategory("1");
        ser.updateById(1, "bye", "thtrhj", "gbreh rth th", 45657);
    }
}
