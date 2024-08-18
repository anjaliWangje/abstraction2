package abstractionclass;


abstract class test2{
    void test1(){
        System.out.println("test method");
    }
    abstract void test();
}
 abstract class testt2 extends test2{
    abstract void test2();

     @Override
     void test() {
         System.out.println("test method");
     }
 }

abstract class test3 extends testt2{
    abstract void test3();

    @Override
    void test2() {

    }
}

public class abstractiontest2 extends test3 {
    @Override
    void test3() {
        System.out.println("this is test3");
    }

    @Override
    void test1() {
        System.out.println("this is test1");


    }

    @Override
    void test2() {
        System.out.println("this si test2");
    }
}
