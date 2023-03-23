public class App {
    public static void main(String[] args) throws Exception {
        Integer max = 5;
        System.out.println("Pirâmide de números");

        for (int i = 1; i <= max; i++) {
            String myString = "";
            for (int j = 1; j <= i; j++) {
               myString = myString.concat(String.valueOf(i));
            }
            System.out.println(myString);
        }
    }
}
