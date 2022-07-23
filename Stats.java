public class Stats {
    public static void main(String[] Args) {

        if (Args[0].equals("--product")) {
            double product = 1;
            for (int i = 1; i < Args.length; i++) {
                product = product * Double.parseDouble(Args[i]);
            }
            System.out.println(product);
        }

        else if (Args[0].equals("--mean")) {
            double sum = 0;
            for (int i = 1; i < Args.length; i++) {
                sum = sum + Double.parseDouble(Args[i]);
            }
            double mean = sum / (Args.length - 1);
            System.out.println(mean);
        }

        else if (Args[0].equals("--total")) {
            double sum = 0;
            for (int i = 1; i < Args.length; i++) {
                sum = sum + Double.parseDouble(Args[i]);
            }
            System.out.println(sum);
        }

        else if (Args[0].equals("--max")) {
            double maxSoFar = Double.parseDouble(Args[1]);
            for (int i = 1; i < Args.length; i++) {
                double current = Double.parseDouble(Args[i]);
                if (maxSoFar < current) {
                    maxSoFar = current;
                }
            }
            System.out.println(maxSoFar);
        }

        else if (Args[0].equals("--min")) {
            double minSoFar = Double.parseDouble(Args[1]);
            for (int i = 1; i < Args.length; i++) {
                double current = Double.parseDouble(Args[i]);
                if (minSoFar > current) {
                    minSoFar = current;
                }
            }
            System.out.println(minSoFar);
        }

        else {
            System.out.println("Bad option " + Args[0]);
        }
    }
}