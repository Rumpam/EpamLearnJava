package Anonymous;

public class Anonymous {
    static ISummator createSummator() {
        ISummator summator = new ISummator() { //выглядит так будто создается объект интерфейса(создавать объект интерфейса - невозможно),
                                               //но читается это так:
                                               //объявили класс, посредствам скобок {} и создали его объект с помощью ();
            /*JVM такую запись арсшифровывает так:
            1 создается безимянный класс, реализующий интерфейс ISummator
            2 т.к такой класс это интерфейс, то нужно реализовать все его методы
            3 создается один объект этого класса ISummator summator = new ISummator() { };
            */
            @Override
            public int plus(int a, int b) {
                return a + b;
            }

            @Override
            public int remDiv(int a, int b) {
                return a % b;
            }

            @Override
            public double div (int a, int b) {
                return (double) a / b;
            }
            @Override
            public int pow(int a, int b) {
                return (int) Math.pow(a, b);
            }
        }; //обрати внимание на ; в конце!
        return summator;
    }
}
