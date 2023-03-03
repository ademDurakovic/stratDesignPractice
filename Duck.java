public class Duck {
    

    protected FlyBehavior flyType;

    protected QuackBehavior quackType;

    public Duck(){
        System.out.println("Duck Made!");

    }
    public void swim(){
        System.out.println("I'm Swimming!");
    }

    public void setFly(FlyBehavior fly){
        this.flyType = fly;
    }

    public void setQuack(QuackBehavior quack){
        this.quackType = quack;
    }

    public void performFly(){
        flyType.fly();
    }
    public void Performquack(){
        quackType.quack();
    }



}
