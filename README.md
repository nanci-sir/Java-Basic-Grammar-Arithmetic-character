# Java-Basic-Grammar-Arithmetic-character
Java基础语法 运算符
##   1.算术运算符

```
package operator;
public class operatorDemo1 {
    public static void main(String[] args) {
        //掌握基本算数运算符；
        int a= 10;
        int b=3;
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a*1.0 / b);//3.333333 转换为小数显示技巧
        System.out.println(a % b);//1
    }
}
```

1.1/和%的区别：两个数据做除法，/取结果的商，%取结果的余数。

1.2整数操作只能得到整数，要想得到小数，必须有浮点数参与运算。

1.3数值拆分 

  一个三位数，将其拆分为个位、十位、百位后，打印出来

```
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
```

公式总结：

 个位 ：数值 % 10 

十位 ：数值 / 10 % 10

 百位 ：数值 / 10 / 10 % 10 

千位 ：数值 / 10 / 10 / 10 % 10; ..

## 2.字符的“+”操作

2.1char类型参与算术运算，使用的是计算机底层对应的十进制数值。需要我们记住三个字符对应的数值：

'a'  --  97		a-z是连续的，所以'b'对应的数值是98，'c'是99，依次递加

'A'  --  65		A-Z是连续的，所以'B'对应的数值是66，'C'是67，依次递加

'0'  --  48		0-9是连续的，所以'1'对应的数值是49，'2'是50，依次递加

~~~java
// 可以通过使用字符与整数做算术运算，得出字符对应的数值是多少
char ch1 = 'a';
System.out.println(ch1 + 1); // 输出98，97 + 1 = 98

char ch2 = 'A';
System.out.println(ch2 + 1); // 输出66，65 + 1 = 66

char ch3 = '0';
System.out.println(ch3 + 1); // 输出49，48 + 1 = 49
~~~

2.2 byte类型，short类型和char类型将被提升到int类型，不管是否有其他类型参与运算。

2.3 整个表达式的类型自动提升到与表达式中最高等级的操作数相同的类型

2.4 除了做基本数学运算，还有哪些功能？

  与字符串做+运算时会被当成连接符，其结果还是字符串。  能算则算，不能算就在一起

```
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
```

​       

##  3.赋值运算符（应用）

3.1 赋值运算符的作用是将一个表达式的值赋给左边，左边必须是可修改的，不能是常量。

| 符号 | 作用       | 说明                  |
| ---- | ---------- | --------------------- |
| =    | 赋值       | a=10，将10赋值给变量a |
| +=   | 加后赋值   | a+=b，将a+b的值给a    |
| -=   | 减后赋值   | a-=b，将a-b的值给a    |
| *=   | 乘后赋值   | a*=b，将a×b的值给a    |
| /=   | 除后赋值   | a/=b，将a÷b的商给a    |
| %=   | 取余后赋值 | a%=b，将a÷b的余数给a  |

注意：扩展的赋值运算符隐含了强制类型转换。

3. 2作用是什么

 基本作用是赋值；+=还可以实现数据的累加，把别人的数据加给自己

~~~java
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

~~~

##  3.自增自减运算符

| 符号 | 作用 | 说明        |
| ---- | ---- | ----------- |
| ++   | 自增 | 变量的值加1 |
| --   | 自减 | 变量的值减1 |

3.1注意事项：

​	++和-- 既可以放在变量的后边，也可以放在变量的前边。

​	单独使用的时候， ++和-- 无论是放在变量的前边还是后边，结果是一样的。

​	参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--。

​	参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作。

​	最常见的用法：单独使用。

~~~java
package operator;
public class operatorDemo3 {
    public static void main(String[] args) {
        //学会自增自减运算符
        int i = 10;
        i++; // 单独使用
        System.out.println("i:" + i); // i:11

        int j = 10;
        ++j; // 单独使用
        System.out.println("j:" + j); // j:11

        int x = 10;
        int y = x++; // 赋值运算，++在后边，所以是使用x原来的值赋值给y，x本身自增1
        System.out.println("x:" + x + ", y:" + y); // x:11，y:10

        int m = 10;
        int n = ++m; // 赋值运算，++在前边，所以是使用m自增后的值赋值给n，m本身自增1
        System.out.println("m:" + m + ", m:" + m); // m:11，m:11
        //面试题
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        //c 10 11 12 11
        //d 5 4 5
        //rs3 =10 + 12 - 4 - 5 + 1 + 12=26
        System.out.println(c);//11
        System.out.println(d);//5
        System.out.println(rs3);//26
    }
}

~~~

3.2 自增、自减运算符是什么，有什么作用？ 

++、--。对当前变量值+1、-1 

 3.3 自增、自减运算符在变量前后有区别吗？

 如果单独使用放前后是没有区别的。

 非单独使用：在变量前 ，先进行变量自增/自减，再使用变量。 

 非单独使用：在变量后 ，先使用变量，再进行变量自增/自减

##  4.关系运算符（应用）

4.1关系运算符有6种关系，分别为小于、小于等于、大于、等于、大于等于、不等于。

| 符号 | 说明                                                    |
| ---- | ------------------------------------------------------- |
| ==   | a==b，判断a和b的值是否相等，成立为true，不成立为false   |
| !=   | a!=b，判断a和b的值是否不相等，成立为true，不成立为false |
| >    | a>b，判断a是否大于b，成立为true，不成立为false          |
| >=   | a>=b，判断a是否大于等于b，成立为true，不成立为false     |
| <    | a<b，判断a是否小于b，成立为true，不成立为false          |
| <=   | a<=b，判断a是否小于等于b，成立为true，不成立为false     |

4.2 关系运算符的结果都是boolean类型，要么是true，要么是false。

4.3 千万不要把“==”误写成“=”，"=="是判断是否相等的关系，"="是赋值。

## 5.逻辑运算符

5.1 逻辑运算符把各个运算的关系表达式连接起来组成一个复杂的逻辑表达式，以判断程序中的表达式是否成立，判断的结果是 true 或 false。

| 符号 | 作用     | 说明                                         |
| ---- | -------- | -------------------------------------------- |
| &    | 逻辑与   | a&b，a和b都是true，结果为true，否则为false   |
| \|   | 逻辑或   | a\|b，a和b都是false，结果为false，否则为true |
| ^    | 逻辑异或 | a^b，a和b结果不同为true，相同为false         |
| !    | 逻辑非   | !a，结果和a的结果正好相反                    |

## 6.短路逻辑运算符

| 符号 | 作用   | 说明                         |
| ---- | ------ | ---------------------------- |
| &&   | 短路与 | 作用和&相同，但是有短路效果  |
| \|\| | 短路或 | 作用和\|相同，但是有短路效果 |

6.1 说明：

- 逻辑与&，无论左边真假，右边都要执行。
- 短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
- 逻辑或|，无论左边真假，右边都要执行。
- 短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。

6.2逻辑运算符有哪些，有什么特点？

⚫ 逻辑与“&” ：有一个为false、结果是false 

⚫ 短路与&&： 一个为false、结果是false。前一个为false,后一个条件不执行了 

⚫ 逻辑或“|”：有一个为true、结果是true 

⚫ 短路或||：一个为true、结果是true。前一个为true，后一个条件不执行了 

⚫ 逻辑非“!”：!false=true、 !true=false 

⚫ 逻辑异或“^” ：相同是false、不同是true。 

⚫ 注意：实际开发中、常用的逻辑运算符还是：&& 、 || 、 ！

~~~java
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

       System.out.println(!ture);//false
       System.out.println(!faluse);//ture

        //异或两个不同为真
       System.out.println(ture ^ ture);//false
       System.out.println(false ^ false);//false
        System.out.println(ture ^ false);//ture
        System.out.println(false ^ ture);//ture

        //短路与
        //短路或；
        int a = 10;
        int b =20;
        System.out.println(a > 100 && ++b>10);//ture
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

~~~

## 7.三元运算符

7.1三元运算符语法格式：

~~~java
关系表达式 ? 表达式1 : 表达式2;
~~~

解释：问号前面的位置是判断的条件，判断结果为boolean型，为true时调用表达式1，为false时调用表达式2。其逻辑为：如果条件表达式成立或者满足则执行表达式1，否则执行第二个。

~~~java
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

~~~

## 8.运算符优先级 

8. 1在表达式中，哪个运算符先执行后执行是要看优先级的，例如 “*、/” 的优先级高于”+、-”

```
package operator;

public class operatorDemo7 {
    public static void main(String[] args) {
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        System.out.println( (10 > 3 || 10 > 3 ) && 10 < 3); // false
    }
}

```

## 9.键盘录入

9.1 请完成Java程序与用户交互，比如录入用户输入的名称、年龄，怎么办？。

API （Application Programming Interface,应用程序编程接口） ⚫ Java写好的程序(功能代码)，咱们可以直接调用。 ⚫ Oracle 也为Java写好的程序提供了相应的 API文档(技术使用说明书) 。

9.2 下载API文档： http://www.oracle.com/technetwork/java/javase/downloads/index.html

```
package scanner;
import java.util.Scanner;//1.导包
public class ScannerDemo {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);//得到键盘扫描对象
    //调用对象功能等待接受
     System.out.println("请输入您的年龄: ");
     int age = sc.nextInt() ;
     System.out.println("您的你年龄是: "+age);
     System.out.println("请输入您的名字: ");
     String name = sc.next() ;
     System.out.println("欢迎: "+name);
    }
}
```

请输入您的年龄: 
120
您的你年龄是: 120
请输入您的名字: 
南辞
欢迎: 南辞
