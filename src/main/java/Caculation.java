import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanbao on 2016/5/29.
 */
public class Caculation {

    public static List calc(int i) {
        ArrayList resList = new ArrayList();
        for (int m = 2; m < i; m++){
            while(i%m==0 && i > m){
                resList.add(m);
                i/=m;
            }
        }
//        while (i%2==0 && i > 2){
//            resList.add(2);
//            i/=2;
//        }
//        while (i%3==0 && i > 3){
//            resList.add(3);
//            i/=3;
//        }
//        if (i == 4){
//            resList.add(2);
//            resList.add(2);
//            return resList;
//        }
//        if (i == 6){
//            resList.add(2);
//            resList.add(3);
//            return resList;
//        }
        resList.add(i);
        return resList;
    }
}
