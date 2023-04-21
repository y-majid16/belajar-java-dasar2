public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("majid");

        }
        static void sayHello(){
        System.out.println("hallo");

        static void sayHello(String name){
        System.out.println("hallo" + name);
        }
    }
}
