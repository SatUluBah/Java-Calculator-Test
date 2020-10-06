public class Result {
    public static int resultNum (int x, int y, char op) {
        int res = switch (op) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> x / y;
            default -> 0;
        };
        return res;
    }
}
