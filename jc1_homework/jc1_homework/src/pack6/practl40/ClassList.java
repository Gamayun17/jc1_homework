package jc1_homework.src.pack6.practl40;

import java.util.ArrayList;

public class ClassList {
    public static void main(String[] avgs) {
        int student = 20;
        int neyd=4;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < student; i++) {
            int r = (int)(Math.random() * 10+1);
            marks.add( r);
        }
        System.out.println("Оценки учеников:"+ marks);
        ArrayList<Integer> neydMarks =new ArrayList<>();
        for (int i=0; i<student; i++){
            int nm=marks.get(i);
            if (nm<=neyd){
                neydMarks.add(nm);
            }

        }
        System.out.println("Неудовлитворительные оценки учеников:"+ neydMarks);
        marks.removeAll(neydMarks);
        System.out.println("Список удовлитворительных оценок:"+ marks);
    }
}