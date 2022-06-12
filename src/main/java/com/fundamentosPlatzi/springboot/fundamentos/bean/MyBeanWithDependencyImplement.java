package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public String printWhithDependency() {
        int numero = 9;
        System.out.println("Hola desde la implementacion de un bean con dependencia");
        return("La dependencia inyectada le sumara 1 a " + numero + ": " + myOperation.sum(numero));
    }
}
