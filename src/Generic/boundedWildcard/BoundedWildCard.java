package Generic.boundedWildcard;

import java.util.List;

public class BoundedWildCard {
    public void copy(List<? extends Product> src, List<? super Product> dest) {
        for (Product p : src) {
            dest.add(p);
        }
    }
    /*
    - extends (ограничение сверху)
    - super (ограничение снизу)

    Для решения какое ключ.слово использовать - нужно решить что это за аргумент(кот.передается в функции) IN или OUT
    "IN"аргумент - предоставляет значение (в примере выше это src)
    "OUT"аргумент - получает значение (в примере выше это dest)
    */

    boolean find(List<? extends Product> all, Product product) {
        for (int i = 0; i < all.size(); i++) { // for(Product value: all)
            if (all.get(i) == product) {
                return true;
            }
        }
        return false;
    }
    /*
    * */

    public void main(String[] args) {
        List<Camera> cameras = new Camera();
        find(cameras, new Camera());
    }


}