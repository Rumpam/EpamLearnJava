package ErrorHanding;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class tryCatch {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("111111111111111111111111111111111111111111111111.9");
        BigDecimal result = bigDecimal.add(BigDecimal.valueOf(333));
        bigDecimal.setScale(2, BigDecimal.ROUND_CEILING);

        String str = "QWERTY";
        System.out.println(str.replace("dc", "cd"));
        System.out.println(str.toLowerCase());

        LocalDate aDate = LocalDate.now();
        LocalDate addWeek = aDate.plusWeeks(1);
        LocalDate addMonth = aDate.plusMonths(1);
        LocalDate addOneYear = aDate.plusYears(1);
        LocalDate addTenYear = aDate.plusYears(10);
    }
}
