package DesignPatterns.Builder;

/* Для билдера нужны:
 -поля класса
 -Геттеры
 -сам билдер
 -изменения в классе(моделька) от которого создается билдер.

 *Конструктор модели не должен быть доступен никому, кроме самого билдера */

public class ContactBuilder {
    private String name;
    private String lastName;
    private int phoneNumber;

    /*
    * 1 создание метода, для мутирования поля класса - name (имя мутирующего метода должно совпадать с именем мутируемого поля)
    * 2 в поле текущего класса, записывается новое значение
    * 3 и возвращает текущий инстанс КонтактБилдера*/
    public ContactBuilder name(final String name) {
        this.name = name;
        return this; //вернуть нужно поле класса
    }

    public ContactBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this; //вернуть нужно поле класса
    }

    public ContactBuilder phoneNumber(final int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this; //вернуть нужно поле класса
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    /* сам билдер:
    * -return'ит новый инстанс контакта
    * -в конструктор Contact он передает себя */
    public Contact build() {
        return new Contact(this);
    }
}
