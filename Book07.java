// キャスト演算子 int型変数の一方を浮動小数点型に変換してから演算する
public class Book07 {
    public static void main(String[] args) {
        int totalAge = 23 + 24 + 25 + 25;
        int members = 4;

        double averageAge = totalAge / members;
        System.out.println(averageAge);

        double averageAge2 = (double) totalAge / members;
        System.out.println(averageAge2);

    }
    
}
