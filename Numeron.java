import java.util.*;

class Numeron {

    public static void main(String[] args) {
        String   generate_number = "";
        boolean  validateFlag;
        String   line;
        String[] userInput;
        int      hitCount = 0;
        Scanner  scanner  = new Scanner(System.in);
        HitBlow hitBlow   = new HitBlow();


        // プログラム側でランダムな4桁の数値列を生成
        generate_number = GenerateRandom.generate_random();

        System.out.println("4桁の数字をコマンドラインに入力して！");

        while (hitCount != 4) {
            // ユーザー入力
            line = scanner.next();
            // 空白文字（スペース、タブなど）で分割
            userInput = line.trim().split("\\s+");

            if (userInput.length != 1) {
                System.out.println("半角は入れないで4桁の数値を入力して");
                continue;
            }

            validateFlag = Validation.validation(userInput[0]);
            
            if (!validateFlag) {
                System.out.println("半角4桁の文字列以外が入力されているよ");
                continue;
            }
            
            // ユーザー入力とランダム数字のhitカウント数を求める
            hitCount = hitBlow.hit(userInput[0], generate_number);
            System.out.println("Your number is "+hitCount+ " hit!!");
        }
        
        scanner.close();
        System.out.println("Finish !! the answer is "+ generate_number);
    }
}