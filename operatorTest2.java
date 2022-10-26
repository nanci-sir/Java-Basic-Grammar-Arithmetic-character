package operator;
public class operatorTest2 {
    public static void main(String[] args) {
        //需求：一个三位数，将其拆分为个位、十位、百位后，打印出来
        int data = 234;
        int ge = data % 10;
        System.out.println(ge);//4
        int shi = data / 10 % 10;
        System.out.println(shi);//3
        int bai = data / 10 / 10 % 10;
        System.out.println(bai);//2
    }
}
