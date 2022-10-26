package operator;

public class operatorDemo6 {
    public static void main(String[] args) {
        //学会三元运算符
       double score = 98;
       String rs = score >=60 ? "考试通过":"挂科";
        System.out.println(rs);//考试通过


        //从两个数找出较大值；
        int a = 10;
        int b = 100;
        int max = a>b ? a:b;
        System.out.println(max);//100

        //求三个整数最大值
        int i = 10;
        int j = 20;
        int k =30;
        int temp = i > j ? i:j;
        int rsmax = temp > k ? temp : k;
        System.out.println(rsmax);//30
        //三元嵌套
        int rsmax2 = i > j ? (i > k ? i : k):(j > k ? j : k);
        System.out.println(rsmax2);//30


    }
}
