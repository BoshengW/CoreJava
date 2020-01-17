package JavaSE.DesignPattern.Strategy;


// make different classes based on same interface in order to replace, which suitable for different client's requirement.
public class MultiStrategy {
    private Strategy strategy;

    public MultiStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy() {
        this.strategy = strategy;
    }

    public static void main(String[] args) {

        // select method you want
        SubStrategy method = new SubStrategy();
        MultiStrategy myStrategy = new MultiStrategy(method);
    }
}

interface Strategy{
    int calculate(int a,int b);
}

class SubStrategy implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}

class AddStrategy implements Strategy{
    @Override
    public int calculate(int a,int b) {
        return a+b;
    }
}