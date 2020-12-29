package CloneObject;

import java.util.Date;
import java.util.GregorianCalendar;

class Employer implements Cloneable {
    private String name;
    private int age;
    private Date hireDate;

    public Employer(String n, int a) {
        name = n;
        age = a;
        hireDate = new Date();
    }

    public void setHireDate(int year, int month, int day) {
        hireDate = new GregorianCalendar(year, month - 1, day).getTime();
    }

    @Override
    public Employer clone() throws CloneNotSupportedException {
        //вызов Object.clone()
        Employer cloned = (Employer) super.clone();

        //клонирование изменяемых полей
        cloned.hireDate = (Date) hireDate.clone();
        return cloned;
    }
}

public class DeepClone {
    public static void main(String[] args) {
        try {
            Employer origin = new Employer("Ivan", 20);
            origin.setHireDate(2020,10,1);
            Employer copy = origin.clone();
            copy.setHireDate(2020,9,1);
            System.out.println("original = " + origin);
            System.out.println("after change = " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
