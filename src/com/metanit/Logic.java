package com.metanit;


/*
26. Реализовать функцию:

        public static List<Integer> createNewList(List<Integer> list1,
        List<Integer> list2),

которая создаст новый список элементов из четных элементов первого списка, которых нет во втором списке, и нечетных элементов второго списка,которых нет в первом списке.
Элементы в возвращаемом списке должны быть представлены в порядке возрастания значений.
Для удобства реализовать дополнительные функции:

public static int indexOf(List<Integer> list, int value)
public static void sort(List<Integer> list)
 */


import java.util.ArrayList;
import java.util.List;

public class Logic {

    public static List<Integer> createNewList(List<Integer> list1, List<Integer> list2) {

        List<Integer> result = new ArrayList<>(list1.size());
        int max;

        if (list1.size() > list2.size())
            max = list1.size();
        else max = list2.size();

        for (int i = 0; i < max; i++) {

            if (list1.get(i) % 2 == 0) {
                if (containsLogic(list1, list2, i, 1)) result.add(list1.get(i));
            }

            if (list2.get(i) % 2 != 0) {
                if (containsLogic(list1, list2, i, 2)) result.add(list2.get(i));
            }

        }

        return result;
    }

    public static boolean containsLogic(List <Integer> list1, List <Integer> list2, int i, int key) {

        if (key == 1) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) return false;
                else continue;
            }

        } else {
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i) == list1.get(j)) return false;
                else continue;
            }
        }

       return true;
    }

    public static void sort(List<Integer> list) {

    
        int N = list.size();
        int t = 0;

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)

                if (list.get(i) > list.get(j)) {
                    t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }





    }
}
