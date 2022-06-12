package com.fundamentosPlatzi.springboot.fundamentos.bean;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBean;

public class MyBeanImplementTwo implements MyBean {
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia del Bean DOS");
    }
}
