package Generic;

import java.util.List;

/*
Итак, написать нужно метод findIndex, который к тому же не статический, который выполняет простое задание, он в листе
находит первое вхождение заданного элемента (элемент задается вторым входящим аргументом метода) и возвращает
индекс (целочисленный) данного элемента в заданом листе. Если элемент не найден в заданом листе, то возвращается -1
*/

public class CollectionsHelper {
    public int hack(List list, Object target) {
        return list.indexOf(target);
    }

    public int findIndex(List list, Object target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
