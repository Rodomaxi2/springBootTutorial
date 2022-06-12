package com.fundamentosPlatzi.springboot.fundamentos;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentosPlatzi.springboot.fundamentos.bean.MyOperationImplement;
import com.fundamentosPlatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithDependency myBeanWithDependency;

	@Autowired
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		System.out.println(myBeanWithDependency.printWhithDependency());
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}
}
