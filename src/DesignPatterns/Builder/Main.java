package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        //создать ссылку на Contact
        //справа создать инстанс ContactBuilder()
        //после созд.инстанса можно вызывать его методы через точку, для мутирования полей
        Contact contact = new ContactBuilder()
                .name("Slava") //после смены поля, метод возвращает сам себя, что позволяет дальше менять поля через точку
                .lastName("Ivanoc")
                .phoneNumber(111)
                .build(); //в конце нужен Билд
    }
}
