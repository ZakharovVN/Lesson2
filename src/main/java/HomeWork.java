public class HomeWork {
    public static void main(String[] args) {
//  Задание №1
        taskOne(10, 10);
        System.out.println(taskOne(10, 10));

//  Задаие №2
        taskTwo(-11);

//  Задание №3
        taskThree(12);
        System.out.println(taskThree(12));

//  Задание №4
        taskFour("Hello World!!!", 5 );
    }

    public static boolean taskOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void  taskTwo(int c){
        if ( c >= 0){
            System.out.println("Положительное число");
        }else if (c < 0){
            System.out.println("Отрицательное число");
        }
    }

    public static boolean taskThree(int d){
        if (d <= 0){
            return true;
        } return false;
    }

    public  static void taskFour(String str, int num){
        for( int i = 0; i < num; i++){
            System.out.println(str);
        }
    }
}
