package operator;
public class operatorDemo2<abc> {
    public static void main(String[] args) {
        //符号+连接符
        int a = 5 ;
        System.out.println("abc" + a); // abc5
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a');//abc5a
        System.out.println(15 + "abc" + 15);//abc15abc
        System.out.println(a + "" +'a');//5a
        System.out.println(a + 'a'+" nanci ");//=5+97 nanci = 102 anci
        System.out.println("nanci"+ a + 'a');//nanci5a
        System.out.println("nanci"+ ( a + 'a' ));//nanci102
    }
}
