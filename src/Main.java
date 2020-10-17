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
    }
}
