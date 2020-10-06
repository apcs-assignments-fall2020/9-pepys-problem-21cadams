public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int times= 0;
        int total= 0;
        int six=0;
        for (int i = 1; i <= 1000000; i++){
            six=0;
            for (int k = 1; k <= 6; k++){
                int flip = (int)(Math.random() * 6 + 1);
                if (flip == 6){
                    six = six +1;
                } 
            }
            if (six>0){
                total++;
            }
            times++;

        }
        Double to = new Double(total);
        Double ti = new Double(times);
        Double avg = (to/ti) * 100;
        System.out.print( "The average is " + avg);
        return avg;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int times= 0;
        int total= 0;
        int six=0;
        for (int i = 1; i <= 1000000; i++){
            six=0;
            for (int k = 1; k <= 12; k++){
                int flip = (int)(Math.random() * 6 + 1);
                if (flip == 6){
                    six = six +1;
                } 
            }
            if (six>1){
                total++;
            }
            times++;
        }
        Double to = new Double(total);
        Double ti = new Double(times);
        Double avg = (to/ti) * 100;
        System.out.print( "The average is " + avg);
        return avg;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int times= 0;
        int total= 0;
        int six=0;
        for (int i = 1; i <= 10000000; i++){
            six=0;
            for (int k = 1; k <= 18; k++){
                int flip = (int)(Math.random() * 6 + 1);
                if (flip == 6){
                    six = six +1;
                } 
            }
            if (six>2){
                total++;
            }
         
            times++;
        }
        Double to = new Double(total);
        Double ti = new Double(times);
        Double avg = (to/ti) * 100;
        System.out.print( "The average is " + avg);
        return avg;
    }


    public static void main(String[] args) {
        probabilityOneSix();
        probabilityTwoSixes();
        probabilityThreeSixes();

    }
}
