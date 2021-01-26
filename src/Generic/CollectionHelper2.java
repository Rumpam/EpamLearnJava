package Generic;

import Generic.human.Human;
import Generic.human.Sex;

import java.util.List;

public class CollectionHelper2<T extends Human> { //цель-корректно работать с любым типом, который унаследован от Human(например: Man/Woman)
    /* принимает на вход:
    -список элементов некого типа, в котором будет производить поиск;
    -строку с префиксом имени;
    -параметр типа Sex; */
    public T findFirst(List<T> human, String prefix, Sex sex) { //возвращает найденный элемент типа T или null(если элемент не найден)
        for (int i = 0; i < human.size(); i++) {
            //находит первый элемент во входящем списке, у которого совпадают: начало имени с префиксом и пол;
            if (sex.equals(human.get(0).getSex()) && human.get(0).getName().startsWith(prefix)) { //или for (T t: human)
                return human.get(i);
            }
        }
        return null;
    }

    public int findIndex(final List<? extends Human> humans, String prefix) {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().startsWith(prefix)) {
                return i;
            }
        }
        return -1;
    }

    //обобщенные методы
    public static class GenericMethods {
        public static <T> int findFirstIndex(final List<T> list, final T target) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    return i;
                }
            }
            return -1;
        }

        public static <T> int findLastIndex(final List<T> list, final T target) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}
