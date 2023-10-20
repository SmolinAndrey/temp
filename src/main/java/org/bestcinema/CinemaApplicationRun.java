package org.bestcinema;

import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("",16, 5));
        viewers.add(new Viewer("",34, 55));
        viewers.add(new Viewer("",67, 85));
        viewers.add(new Viewer("",5, 2));
        viewers.add(new Viewer("",53, 25));

        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
