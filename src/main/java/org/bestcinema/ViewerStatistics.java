package org.bestcinema;

import java.util.ArrayList;

public class ViewerStatistics {
    public static double averageAge(ArrayList<Viewer> viewers){
        int cnt = 0;
        if (viewers != null) {
            for (Viewer viewer : viewers) {
                cnt += viewer.getCnt();
            }
            return (double) cnt /viewers.size();
        }
        return 0D;
    }
}
