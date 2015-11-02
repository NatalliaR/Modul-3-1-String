package by.epam.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Natallia_Ramanchyk
 */
public class StringManager {

    private List<String> list;

    public StringManager() {
        list = new ArrayList<>();
    }

    /**
     * Метод для добавления очередной строки.
     *
     * @param str строка для добавления
     */
    public void addString(String str) {
        if (str != null) {
            list.add(str);
        }
    }

    /**
     * Метод для поиска второй по длине строки
     *
     * @return вторая по длине строка или null, если такую
     * строку не удалось определить
     */
    public String findSecondShortestString() {
        if (list.size() < 2) {
            return null;
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        return list.get(1);
    }
}
