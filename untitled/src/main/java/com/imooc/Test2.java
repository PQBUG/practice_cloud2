package com.imooc;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author hongy
 * @Date 2024/1/21 21:32
 **/
public class Test2 {
    public static void main(String[] args) {
        Test2_A[] arr = new Test2_A[10];
    }
}

class Test2_A {
    static {
        System.out.println("Test2_A的静态代码块运行！");
    }
}
