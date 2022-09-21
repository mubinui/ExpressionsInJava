import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFrameworkConditionalOperations  {
    public static void main(String[] args) {

        int a [] = {1,2,3,4,5,6};
        String x = Arrays.toString(a);
        System.out.println(x);
        List<Integer> list = List.of(12,34,6);
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("---------------->COMPARATOR/COMPARABLE-------->");
        ArrayList<Employee> employees  = new ArrayList<>();
        employees.add(new Employee("A","B",9));
        employees.add(new Employee("D","E",11));
        employees.add(new Employee("F","G",5));
        System.out.println(employees);
        //comparable
        Collections.sort(employees); // comparable when to use single logic
        System.out.println(employees);

        //comparator
        System.out.println("-------------------->COMPARATOR----------------->");
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("A","F",20,1));
        people.add(new Person("B","G",21,2));
        people.add(new Person("C","H",18,4));
        people.add(new Person("D","I",22,6));
        people.add(new Person("E","J",23,3));
        System.out.println(people);
        Collections.sort(people,new ComparatorClass());
        System.out.println(people);




    }
}
