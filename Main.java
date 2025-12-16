abstract class A{
    private int a,b;
    protected float m,n;
    public int i,j;

    A(){
        a=1;
        b=1;
    }
    abstract void display();
}

class C extends A{
    C(float m, float n){
        this.m = m;
        this.n = n;
    }
    void display(){
        System.out.println(m+n);
        System.out.println("class c");
    }
}

class B extends C{
    B(float i, float j){
        super(i,j);
    }
    void display(){
        System.out.println(i+j);
        System.out.println("class b");
    }
}

class D extends A{
    void display(){
        System.out.println("class d");
    }
}

class Over {
    void area(int a, int b){
        System.out.println(a*b);
    }
    void area(int a){
        System.out.println(22/7*a*a);
    }
}

public class Main{
    public static void main(String[] args) {
        C c1 = new C(3,5);
        c1.display();
        B b1 = new B(4,9);
        b1.display();
        D d1 = new D();
        d1.display();
        Over ov = new Over();
        ov.area(2,3);
        ov.area(4);
    }
}