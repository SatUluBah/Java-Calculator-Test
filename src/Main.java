import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение для вычисленя суммы, разности, деления или умножения в одну строку Арабскими или Римскими цифрами от 1 до 10:");
        String str = scan.nextLine();

        int indexOper = IndexOperator.getIndexOperator(str);
        String a = "";
        String b = "";
        char operator = 0;
        try {
            a = str.substring(0, indexOper).toUpperCase();
            b = str.substring(indexOper + 1).toUpperCase();
            operator = str.charAt(indexOper);
        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println("Неверный ввод выражения");
        }

        int x;
        int y;
        boolean flag = false;
        String[] arabArr = {"1","2","3","4","5","6","7","8","9","10"};

        for (String s : arabArr) {
            if (a.equals(s) || b.equals(s)) {
                flag = true;
                break;
            }
        }
        try {
            if (flag) {
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
            } else {
                x = RomanToArabic.romanToArabic(a);
                y = RomanToArabic.romanToArabic(b);
            }
            if (x <= 0 || x > 10 || y <= 0 || y > 10) {
                System.err.println("Одна из введенных цифр не соответствуют условиям!");
            } else {
                int result = Result.resultNum(x, y, operator);
                if(flag) {
                    System.out.println(result);
                } else {
                    try {
                        String resRom = ArabicToRoman.arabicToRoman(result);
                        System.out.println(resRom);
                    } catch (IllegalArgumentException ex) {}
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println("Введенное выражение не соответствует условиям ввода!");
        }
    }
}



