public class RekursivIterativSumme {
    public static void main(String[] args) {
        long nummerSumme = nummernSumme(34);
        System.out.println("rekursiv: " + nummerSumme);
        long nummerSummeIterativ = nummernSummeIterativ(34);
        System.out.println("iterativ: " + nummerSummeIterativ);

    }
    public static long nummernSumme(long nummer){
        if(nummer != 0){
            return nummer + nummernSumme(nummer - 1);
        }else{
            return nummer;
        }
    }
    public static long nummernSummeIterativ(long nummer){
        long summe = 0;
        summe = summe + nummer;
        while(nummer!=0){
            nummer--;
             summe = summe + nummer;
        }
        return summe;
    }
}
