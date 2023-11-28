package seminars.five.number;

import java.util.List;

public class MaxNumberModule {


    public int maxInListInt(List<Integer> listInt) {
        int max = 0;

        for (Integer el : listInt) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }
}
