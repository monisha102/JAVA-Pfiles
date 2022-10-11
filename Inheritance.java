
class A{


    void msg(){

        System.out.println("I am parent");
    }

}


class B extends A{


    void msg(){

        System.out.println("I am child");
    }

}

public class Main{

    public static void main(String[] args) {
        
        A a = new B();
        a.msg();
    }


}