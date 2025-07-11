public class Validation {

    /**
     * ユーザー入力情報が期待するものか調査する
     * 期待する結果: 4桁の数字
     * 
     * @param userInput ユーザーがコマンドで入力したデータ
     * 
     * @reutun true:  期待するデータ, false: 期待しないデータ
     * 
     */
    public static boolean validation(String userInput) {

        // 文字列が4桁かどうか
        if (userInput.length() != 4) {
            return false;
        }
        
        // 数字以外の文字列が含まれていないか
        if (userInput.matches("\\d{4}") == false) {
            return false;
        }

        return true;
    }
}
