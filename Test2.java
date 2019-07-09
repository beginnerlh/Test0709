/*
请编写一个方法，输出0到n(包括n)中数字2出现了几次。

给定一个正整数n，请返回0到n的数字中2出现了几次。

测试样例：
10
返回：1
*/
package written_test0709;

//2的个数

public class Test2{
    public static void main(String[] args) {
        Count2 count2 = new Count2();
        int n = 156257712;
        System.out.println(count2.countNumberOf2s(n));
    }

}

class Count2 {

    public int countNumberOf2s(int n) {
        int count = 0;
        for(int i = 1;i<n;i*=10){
            int a = n / i;
            int b = n % i;
            count += (a+7)/10*i+((a%10 == 2)?b+1:0);
        }
        return count;
    }
}