/**
 * Created by yuanbao on 2016/5/29.
 */
public class Tennis {
    public static String transformat(int scoreA, int scoreB) {
        String[] scoreDesc = {"Love", "Fifteen","Thirty","Forty"};
        if (scoreA == scoreB){
            if (scoreA >= 3){
                return "Deuce";
            }
            return scoreDesc[scoreA] + " All";
        }
        if (scoreA > 3 ){
            if ((scoreA-scoreB) >=2){
                return "A Win";
            }else {
                return "A Advantage";
            }
        }
        return scoreDesc[scoreA] + " " + scoreDesc[scoreB];
//        if (scoreA == 1){
//            return scoreDesc[1] + scoreDesc[0];
//        }
//        if (scoreA == 2){
//            return scoreDesc[2] + scoreDesc[0];
//        }
    }
}
