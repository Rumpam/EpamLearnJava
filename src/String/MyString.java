package String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class MyString {
    public static void main(String[] args) {
        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDateTime ldt = LocalDateTime.now(timezone);
        System.out.println(ldt);

        LocalDate date = LocalDate.of(2022, 2, 22);
        LocalTime time = LocalTime.of(11, 29, 11);
        System.out.println(date + " " + time);

        LocalDateTime localDateTime = LocalDateTime.of(2001, Month.MARCH, 11, 1, 3, 11, 1111);
        System.out.println(localDateTime);

        String[] arr = {"one", "two"};
        for (int i = 0; i < arr.length; i++) {     //НЕ ссылочный итератор for
            arr[i] += 12;
            System.out.println(arr[i]);            //может изменить массив
        }

        StringBuilder[] sb = new StringBuilder[2]; //ссылочный тип StringBuilder
        sb[0] = new StringBuilder("three");
        sb[1] = new StringBuilder("four");
        for (StringBuilder elem : sb) {            //ссылочный итератор foreach
            elem.append("13");
            System.out.println(elem);
        }
    }
}
