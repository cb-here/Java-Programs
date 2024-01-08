public class Salary{
    public static void main(String[] args){
        double bs = 90_000, hra, da;
        double gs;
        hra = bs * 20 /100;
        da = bs * 40 / 100;
        gs = bs + hra + da;
        System.out.println("Gross Salary is: " + gs);
    }
}