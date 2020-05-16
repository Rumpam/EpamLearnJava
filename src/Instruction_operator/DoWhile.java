package Instruction_operator;

public class DoWhile {
    public static void main(String[] args) {
        /* похоже на while но сначала выполняет все операторы, а потом условие 
        - отличие от while(){ } - тут блок выполнится хотябы 1 раз, если даже условие false */
        int num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
