package Lab3;

public class GCD implements IOperation {
    @Override
    public String getName() {
        return ("НОД");
    }
    @Override
    public String getConnotation() {
        return ("Наибольший общий делитель двух чисел");
    }
    @Override
    public int estimate(int a, int b) {
        return b == 0 ? a : estimate(b,a % b);
    }
}