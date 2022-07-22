public class Stats {
    public static void main(String[] Args){

        if (Args[0].equals("--product")) {
            double product = 1;
            for (int i = 1; i < Args.length; i++) {
                product = product * Double.parseDouble(Args[i]);
            }
            System.out.println(product);
        }
    }
}