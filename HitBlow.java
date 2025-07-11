class HitBlow {

    /**
     * ユーザー入力文字列とランダム生成された文字列の各桁を比較する。Hitしているcount数を返す。
     * 
     * @param userInput
     * @param genarateNumber
     * 
     * @return hitCount
     */
    public int hit(String userInput, String genarateNumber) {
            int hitCount = 0;

            for (int i = 0; i < userInput.length(); i++) {
            
                if (userInput.charAt(i) == genarateNumber.charAt(i)) {
                    hitCount += 1;
                }
            }

            return hitCount;
    }
}