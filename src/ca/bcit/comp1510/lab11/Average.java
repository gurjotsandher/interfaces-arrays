package ca.bcit.comp1510.lab11;

public class Average {
    
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
            return;
        }
        double runningTotal = 0;
        int len = args.length;
        int validArgs = len;
        for (int i = 0; i < len; i++) {
            try {
                runningTotal += Integer.parseInt(args[i]);
            }
            catch(Exception error) {
                System.out.println(error);
                validArgs--;
            }
        }
        double avg = runningTotal / validArgs;
        System.out.println("Average: " + avg);
    }
}
