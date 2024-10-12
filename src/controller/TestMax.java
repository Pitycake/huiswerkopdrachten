package controller;

public class TestMax {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);
        int j = (int) (Math.random() * 100);
        int k = max(i, j);
        System.out.println("The maximum of " + i +
            " and " + j + " is " + k);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
