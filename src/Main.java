import com.flying.creational.builderPattern.LunchOrder;
import com.flying.creational.prototypePattern.Movie;
import com.flying.creational.prototypePattern.Registry;
import com.flying.creational.singletonPattern.Singleton;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("Movie");
        movie.setTitle("Creation Patterns in Java");
        System.out.println(movie);
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie)registry.createItem("Movie");
        anotherMovie.setTitle("Gang");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());

        /*
        LunchOrder.Builder builder = new LunchOrder.Builder();
//        builder.bread("wheat").condiments("Lettuce").dressing("Maye").meat("Turkey");
        builder.bread("wheat").dressing("Maye");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());*/

        /*
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println("Hello World!");*/
    }
}
