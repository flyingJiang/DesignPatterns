import com.flying.creational.builderPattern.LunchOrder;
import com.flying.creational.singletonPattern.Singleton;

public class Main {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
//        builder.bread("wheat").condiments("Lettuce").dressing("Maye").meat("Turkey");
        builder.bread("wheat").dressing("Maye");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        /*
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println("Hello World!");*/
    }
}
