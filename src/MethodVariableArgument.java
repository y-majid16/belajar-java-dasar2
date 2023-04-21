public class MethodVariableArgument {
    public static void main(String[] args) {
//        int[] values = {80,80,75,70,85};
//        sayCongrats("Majid", values);

        sayCongrats("majid", 80,80,86,80,87);

    }

    static void sayCongrats(String name, int... values){
        var total = 0;

        for(var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lullus");
        } else {
            System.out.println("coba lagi");
        }
    }
}
