
import java.util.*;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,r1,r2,d;
        System.out.println("enter the coefficient");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a==0)
            System.out.println("not a quadratic");
        else{
            d = b*b-4*a*c;
            if(d>0){
                System.out.println("roots are real and distinct");
                r1 = (-b+Math.sqrt(d))/(2*a);
                r2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("roots are");
                System.out.println(r1);
                System.out.println(r2);
            }
            else if(d<0){
                System.out.println("roots are imaginary");
                r1 = -b/(2*a);
                r2 = Math.sqrt(Math.abs(d))/(2*a);
                System.out.println("the roots are");
                System.out.println(r1+"+i"+r2);
                System.out.println(r1+"-i"+r2);
            }
            else{
                System.out.println("the roots are real and equal");
                r1 = -b/(2*a);
                System.out.println("the roots are");
                System.out.println(r1);
            }
        }
    }
}

