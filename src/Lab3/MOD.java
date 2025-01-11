package Lab3;

public class MOD implements IOperation {
    @Override
    public String getName() {
        return ("%");
    }
    @Override
    public String getConnotation() {
        return ("Остаток от деления нацело");
    }
    @Override
    public int estimate(int a, int b) {
        return a%b;
    }
}