package Collections;

import java.util.*;

public class CollectionUse {
    public static void main(String[] args) {
        String earth = "Earth";
        String jupiter = "Jupiter";
        String neptune = "Neptune";
        String mars = "Mars";
        String venus = "Venus";
        String uranus = "Uranus";
        String saturn = "Saturn";

        //использование ArrayList
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(earth, jupiter, neptune,
                mars, venus, uranus));
        solarSystem.add("Mercury"); //для ArrayList можно доб.изм. значения
        Collections.sort(solarSystem); //в классе Collections есть сортировка
        Collections.reverse(solarSystem); //обратная сортировка
        System.out.println(solarSystem);

        //использование List с защитой от изменения (для unmodifiableList тип объекта должен быть List а не ArrayList)
        List<String> solarSystemUnmodifined = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(saturn)));
        //solarSystemUnmodifined.add("noop"); //exception
        System.out.println(solarSystemUnmodifined);

        //использование max и min из Collection
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(Collections.max(number));
        System.out.println(Collections.min(number));
    }
}
