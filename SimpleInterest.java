// si --> (p * r * n) / 100

public class SimpleInterest{
    public static void main(String[] args){
        float p = 1000.4f, r = 14.3f;
        int n =3;
        float si;
        si = (p * r * n) / 100;
        System.out.println("Simple interest is: " + si);
    }
}