package com.driver;

public class Main {
  public static void main(String[] args) {
    A a=new A();
    String s1=a.meth();
    System.out.println(s1);

    B b1=new B();
    String s2=b1.meth();
    System.out.println(s2);
  }
}
class A{
    public String meth(){
        return "Invoking method from class A.";

    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B.";
    }
}