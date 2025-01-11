package Lab3;

public class LCM implements IOperation {

    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    @Override
    public String getName() {
        return ("НОК");
    }

    @Override
    public String getConnotation() {
        return ("Наименьшее общее кратное двух чисел");
    }

    @Override
    public int estimate(int a, int b) {
        return a / gcd(a, b) * b;
    }
}