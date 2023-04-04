
interface BakingStrategy{
    void bake();
}

class HandToast implements BakingStrategy{
    @Override
    public void bake(){
        System.out.println("Hand toast pizza");
    }
}

class FreshPan implements BakingStrategy{

    @Override
    public void bake(){
        System.out.println("Fresh Pan Pizza");
    }
}
class PizzaMaker{
    BakingStrategy bakingStrategy;

    PizzaMaker(BakingStrategy bakingStrategy){
        this.bakingStrategy = bakingStrategy;
    }

    void bake(){
        bakingStrategy.bake();
    }
}
public class Main {
    public static void main(String[] args) {
        //Baking Fresh pan Pizza
        PizzaMaker pizzaMaker = new PizzaMaker(new FreshPan());
        pizzaMaker.bake();

        //Baking Hand toast pizza
        PizzaMaker pizzaMaker1 = new PizzaMaker(new HandToast());
        pizzaMaker1.bake();
    }
}