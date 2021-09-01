最低でも1回は実行したい場合は、do while 文を使う

public class Book12 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
       
        do {
            num = num + 1;
            sum = sum + num;
        } while (sum < 100);
        System.out.println("1から" + num + "までの数の和は" + sum + "です。");
    }
}
