package ru.markblog;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactory implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory bean) throws BeansException {
        String list[] = bean.getBeanDefinitionNames();
        for(int i=0;i<list.length;i++){
            BeanDefinition definition=bean.getBeanDefinition(list[i]);
            System.out.println(bean.getBeanDefinition(list[i]+":"+definition.getBeanClassName()));
        }
    }
}
