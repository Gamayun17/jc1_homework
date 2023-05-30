package pack6.practl42;

import java.util.ArrayList;
import java.util.Iterator;

public class MaximumMarks {
    public static void main(String[] avgs) {
        int student = 20;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < student; i++) {
            int r = (int) (Math.random() * 10 + 1);
            marks.add(r);
        }
        System.out.println("Оценки учеников:" + marks);
        int maximum = marks.get(0);
        Iterator iterator = marks.iterator();
        while (iterator.hasNext()) {
            int nextNumber = (int) iterator.next();
            if (nextNumber > maximum) {
                maximum = nextNumber;
            }
        }
        System.out.print("Наивысшая оценка ученика:" + maximum);
    }
}
