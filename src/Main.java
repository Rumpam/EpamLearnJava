import Pattern_Principal.Contact;
import Pattern_Principal.ContactBuilder;

public class Main {
    class Goblin {
        public int money;
    }

    public void tryChangeParamentrValue(Goblin goblin, int[] arr1) {
        goblin.money++;
        arr1[0] = 200;
        goblin = null;
        arr1 = null;
        goblin = new Goblin();

        goblin.money = -400;
        arr1 = new int[100];
        arr1[2] = 3;
    }

    public void test1() {
        Goblin goblin = new Goblin();
        goblin.money = 45;
        int[] arr1 = {};
        tryChangeParamentrValue(goblin, arr1);
        System.out.println(goblin.money);
        System.out.println(arr1[0]);
        System.out.println(arr1[2]);
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.test1();

        //создать ссылку на Contact
        //справа создать инстанс ContactBuilder()
        //после созд.инстанса можно вызывать его методы через точку, для мутирования полей
        final Contact contact = new ContactBuilder()
                .name("Ivan") //после смены поля, метод возвращает сам себя, что позволяет дальше менять поля через точку
                .lastName("Ivanov")
                .phoneNumber(111)
                .build(); //в конце нужен Билд

    }
}
