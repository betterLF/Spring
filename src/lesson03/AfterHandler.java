package lesson03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor {
    @Override
    //返回经过处理后的新的bean
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Person person=(Person)bean;
        if(person.getSex().equals("male")){
            person.setName("aa");
        }else{
            person.setName("bb");
        }
        return person;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
