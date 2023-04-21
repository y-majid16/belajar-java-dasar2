public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(100,100);
        System.out.println(result1);
    }

    static int sum(int value1, int value2){
        var total = value1 +value2;
        return total;
    }
}
