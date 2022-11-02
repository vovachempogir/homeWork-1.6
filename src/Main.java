public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println(" Задача 1 ");
        for (int i = 0; i < 11; i++ ) {
            System.out.println("Итерация цикла " + i );
        }

        //Задача 2
        System.out.println(" Задача 2");
        for (int i = 10; i >= 0; i--){
            System.out.println("Итерация циклов " + i);
        }

        //Задача 3
        System.out.println(" Задача 3");
        for (int i = 0; i < 17; i+=2){
            System.out.println("Итерация циклов " + i);
        }

        //Задача 4
        System.out.println(" Задача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println("Итерация циклов " + i);
        }

        //Задача 5
        System.out.println(" Задача 5");
        for (int i = 1904; i < 2096; i+=4){
            System.out.println( i + " год является високосным");
        }

        //Задача 6
        System.out.println(" Задача 6");
        for (int i = 7; i <= 98; i += 7 ){
            System.out.println("Цикл " + i);
        }

        //Задача 7
        System.out.println(" Задача 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        //Задача 8
        System.out.println(" Задача 8");
        int accumulation = 29000;
        int all = 0;
        for (int i = 1; i <= 12; i++){
            all = all + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + all + " рублей.");
        }

        //Задача 9
        System.out.println(" Задача 9");
        int salary = 70000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }
}