public class Driver {
    public static void main(String[] args) {

        FlyBehavior fly = new Fly();
        NoQuack noQuack = new NoQuack();
        QuackBehavior canQuack = new Quack();

        Duck mallard = new Mallard();

        mallard.setQuack(noQuack);
        mallard.setFly(fly);

        mallard.performFly();
        mallard.Performquack();

        mallard.setQuack(canQuack);

        mallard.Performquack();;



    }
}
