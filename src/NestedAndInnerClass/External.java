package NestedAndInnerClass;

public class External {
    private static int instanceCounter; //приватный модификатор доступа, статичное поле класса
    private int a;                      //приватный модификатор доступа, числовое поле
    int b;                              //default модификатор доступа (виден внутри пакета (package visible)), числовое поле

    public External(int a, int b) {
        this.a = a;
        this.b = b;
        instanceCounter++;
    }

    String sum() {
        int res = a + b;
        return String.format("The non-static method 'sum()'. %d + %d = %d", a, b, res);
    }

    static void messenger(String inputMessage) {
        String someMsg = "empty msg";
        if (inputMessage != null && !inputMessage.isEmpty()) {
            someMsg = inputMessage;
        }
        System.out.printf("The static method 'messenger()' of the outer class. Message: \"%s\"\n\n", someMsg);
    }

    static class Nested {
        static String getInstanceCounter() {
            return instanceCounter + "свободный доступ к статическому полю класса";
        }

        void methodOfExperiments() {
            messenger("свободный досту к статическому методу внешнего класса" +
                    "даже без упоминания имени внешнего класса или его объекта");

            External.messenger("или доступ по имени внешнего класса");

            External instanceInInner = new External(0,0); //создание объекта внешнего класса
            instanceInInner.a = 1;                              //доступ к полям через имя объекта
            instanceInInner.b = 1;                              //доступ к default полю через имя объекта
            System.out.println(instanceInInner.sum());

            messenger(External.Nested.getInstanceCounter());
        }

        class inner  {

        }
    }
}
