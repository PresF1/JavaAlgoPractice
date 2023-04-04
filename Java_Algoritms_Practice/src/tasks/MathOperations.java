package tasks;

// создать метод который принимает на вход 2 числа и возвращает то которое больше
// в случае равенства возвращать любое и выводить сообщение о равенстве
public class MathOperations {

    public static int GetMax(int num1, int num2) {
        return num1 >= num2 ? num1 : num2;
}

    public static int GetMin(int num1, int num2) {
        return num1 <= num2 ? num1 : num2;
    }

}