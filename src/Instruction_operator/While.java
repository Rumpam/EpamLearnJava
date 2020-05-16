
package Instruction_operator;

public class While {
    public static void main(String[] args) {
        int num = 0;
        /* в условии может быть любое выражение но возвращаять должен только boolean 
        - отличие от цикла for - тут нет счетчика, тут только условие 
        - если условие будет false - то блок не выполнится ниразу */
        while (num <= 10) { //while (<условие>) {}
            System.out.println(num);
            num++;
        }
    }
}
