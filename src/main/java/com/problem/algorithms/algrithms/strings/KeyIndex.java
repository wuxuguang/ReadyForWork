package com.problem.algorithms.algrithms.strings;

/**
 * Created by wuxuguang on 2017/5/14.
 */
public class KeyIndex {
    public static void main(String[] args) {
        int count[] = new int[6]; // R+1

        Student[] a = {new Student("Anderson", 2), new Student("Brown", 3), new Student("Davis", 3),
                new Student("Garica", 4), new Student("Harris", 1), new Student("Jackson", 3),
                new Student("Johnson", 4), new Student("Jones", 3), new Student("Martin", 1),
                new Student("Martinez", 2), new Student("Miller", 2), new Student("Moore", 1),
                new Student("Robinson", 2), new Student("Smith", 4), new Student("Taylor", 3),
                new Student("Thoms", 4), new Student("Thompson", 4), new Student("White", 2),
                new Student("Williams", 3), new Student("Wilson", 4)};

        Student[] aux = new Student[a.length];  //N
//        for (Student s : a)
//            System.out.println(s.getName() + "      "   + s.getKey() );
        System.out.println(a.length);
        for (Student s : a)
            count[s.getKey() + 1]++;
        for (int r = 0; r < count.length - 1; r++)
            count[r + 1] += count[r];
        for (Student s : a)
            aux[count[s.getKey()]++] = s;
        System.out.println(aux.length);

    }
}
