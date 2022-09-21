import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorClass implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId()- o2.getId();
    }

//    @Override
//    public Comparator<Person> reversed() {
//        return Comparator.super.reversed();
//    }
//
//    @Override
//    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
//        return Comparator.super.thenComparing(other);
//    }
//
//    @Override
//    public <U> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
//        return Comparator.super.thenComparing(keyExtractor, keyComparator);
//    }
//
//    @Override
//    public <U extends Comparable<? super U>> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor) {
//        return Comparator.super.thenComparing(keyExtractor);
//    }
//
//    @Override
//    public Comparator<Person> thenComparingInt(ToIntFunction<? super Person> keyExtractor) {
//        return Comparator.super.thenComparingInt(keyExtractor);
//    }
//
//    @Override
//    public Comparator<Person> thenComparingLong(ToLongFunction<? super Person> keyExtractor) {
//        return Comparator.super.thenComparingLong(keyExtractor);
//    }
//
//    @Override
//    public Comparator<Person> thenComparingDouble(ToDoubleFunction<? super Person> keyExtractor) {
//        return Comparator.super.thenComparingDouble(keyExtractor);
//    }
}
