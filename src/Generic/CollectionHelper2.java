package Generic;

import Generic.human.Human;
import Generic.human.Sex;

import java.util.List;

/*
принимать на вход:
список элементов некого типа, в котором будет производить поиск;
строку с префиксом имени;
параметр типа Sex;
находить первый элемент во входящем списке, у которого совпадают: начало имени с префиксом и пол;

возвращать найденный элемент типа T или null — если элемент не найден;
корректно работать с любым типом, который унаследован от Human, например: Man/Woman
*/

public class CollectionHelper2 <T extends Human> {
    public T findFirst(List<T> human, String prefix, Sex sex) {
        for (int i = 0; i < human.size(); i++) {
            //или for (T t: human)
            if (sex.equals(human.get(0).getSex()) && human.get(0).getName().startsWith(prefix)) {
                return human.get(i);
            }
        }
        return null;
    }
}
