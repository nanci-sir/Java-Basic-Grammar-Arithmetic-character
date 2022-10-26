package operator;

public class operatorDemo {
    public static void main(String[] args) {
        //学会赋值运算符
        int a= 10;
        int b =200;
        //a = a + b;
        a += b;//a=(int)(a+b)
        System.out.println(a);//210

        byte i = 10;
        byte j = 20;
       // i= (byte) (i+j);
        i +=j;
        System.out.println(i);//30

        int m=10;
        int n=3;
       // m += n;//等价于m=(int)m+n;
       // m -= n;//等价于m=(int)m-n;
       // m *= n;//等价于m=(int)m*n;
       // m /= n;//等价于m=(int)m/n;
        m %= n;//等价于m=(int)m%n;
        System.out.println(m);//1


    }
}
