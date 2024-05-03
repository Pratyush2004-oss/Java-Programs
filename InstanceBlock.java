//                      Instance Block

class A{
    int a, b;

    // priority given according to position of the code
    static void print(){
        System.out.println("Static Method");
    }

    // 3rd priority
    void show(){
        a = 10; b = 90;
        System.out.println("a = " + a + "\t b = " + b);
    }

    // 2nd priority
    A(){
        a = 30; b = 50;
        System.out.println(a + "\t" + b);
    }

    // 1st priority given
    // Instance Block
    {
        a = 130; b = 540;
        System.out.println(a + "\t" + b);
    }
}

class InstanceBlock{
    public static void main(String[] args) {
        A aa = new A();
        aa.show();
        A.print();
    }
}