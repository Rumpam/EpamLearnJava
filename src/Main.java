import Pattern_Principal.Builder.Contact;
import Pattern_Principal.Builder.ContactBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
