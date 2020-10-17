package ClassObject;

public class EqualsHashcode {
    private int id;
    private String name;
    private int yearOfStudy;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EqualsHashcode student = (EqualsHashcode) o;
        if (id != student.id) { //если текущее id не равно переданному
            return false;
        }
        if(yearOfStudy != student.yearOfStudy) {
            return false;
        }
        //тернарный оператор.
        //Если name не пуст, то вызывается equals с переданным объектом
        //иначе проверяется не пустое ли поле name у переданного оператора
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + yearOfStudy;
        return result;
    }
}

