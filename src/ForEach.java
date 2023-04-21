public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Yaumul", "Majid", "Programmer"
        };

//        for (var i=0; i<name.length; i++){
//            System.out.println(name[i]);
//        }
        for (var name:names){
            System.out.println(name);
        }
    }
}
