package operator;

public class operatorDemo5 {
    public static void main(String[] args) {
        //学会使用逻辑运算符
        double size = 9.8;
        double storage = 16;
        //尺寸大于6.9；内存大于8；
        //逻辑&前后都为真才为真
        System.out.println(size >= 6.95 & storage >=8);//ture

        //尺寸大于6.9；内存大于8；
        //逻辑或前后都为真才为真
        System.out.println(size >= 6.95 | storage >=8);//ture
        //取反

      // System.out.println(!ture);//false
       //System.out.println(!faluse);//ture

        //异或两个不同为真
       //System.out.println(ture ^ ture);//false
      // System.out.println(false ^ false);//false
       // System.out.println(ture ^ false);//ture
        //System.out.println(false ^ ture);//ture

        //短路与
        //短路或；
        int a = 10;
        int b =20;
        System.out.println(a > 100 && ++b>10);//false
        System.out.println(b);//20

        System.out.println(a > 100 & ++b>10);//false
        System.out.println(b);//21
        int i = 10;
        int j = 20;
        System.out.println(i >2 || ++j > 10);//ture
        System.out.println(j);//20

        System.out.println(i >2 | ++j > 10);//ture
        System.out.println(j);//21
    }
}
