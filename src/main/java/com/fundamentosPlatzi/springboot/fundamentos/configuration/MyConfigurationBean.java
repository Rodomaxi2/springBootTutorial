package com.fundamentosPlatzi.springboot.fundamentos.configuration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.fundamentosPlatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanImplementTwo();//Aqui se debe de instanciar la implementacion deseada
    }

    @Bean
    public MyOperation operation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency myBeanWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
