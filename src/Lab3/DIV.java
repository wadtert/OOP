package Lab3;

public class DIV implements IOperation {
    @Override
    public String getName() {
        return ("/");
    }
    @Override
    public String getConnotation() {
        return ("Деление нацело");
    }
    @Override
    public int estimate(int a, int b) {
        return a/b;
    }
}
