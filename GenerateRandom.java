import java.util.*;

public class GenerateRandom {
        /**
     * 4桁のランダム数字を生成する処理
     * 4桁を構成する数字の重複は無しとする
     * 
     * @return make_number 
     */
    public static String generate_random() {
        // Stringは不変なクラスで文字列を足すごとにインスタンス化しているためメモリを無駄に消費している。
        // StringBuilderは可変なクラスのため文字列連結を滞りなく行える
        StringBuilder make_number = new StringBuilder(); 

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));

        // ランダムにリスト内をシャッフルする
        Collections.shuffle(numbers);

        for (int i = 0; i < 4 ;i++) {
            String number = numbers.get(i);
            
            make_number.append(number);
        }
        
        // toString()で文字列を取り出す
        return make_number.toString();
    }
}
