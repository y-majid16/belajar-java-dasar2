public class Switch {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus");
                break;
            case "B":
                System.out.println("Dikit lagi");
                break;
            case "C":
                System.out.println("Gagal");
                break;
            default:
                System.out.println("coba lagi");
        }
    }
}
