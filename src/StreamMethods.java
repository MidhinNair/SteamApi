import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        //filter(Predicate)  : Predicate means true/false (Operations using t/f)
        //lamda use e->{};//e->e>10 etc;

        //map(function)
        /*
        each element operation
*/
        List<String> city = List.of("tvm","ekm","kok","knr");
        List<String> ans= city.stream().filter(e->e.startsWith("k")).collect(Collectors.toList());
        System.out.println(ans);
        List<Integer> nuners = List.of(1,3,56,88);
        List<Integer> ans2=nuners.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(ans2);

        city.stream().forEach(System.out::println); //printing
        //metheod refearence . scope resulution
        city.stream().sorted().forEach(System.out::println);
        Integer intr=nuners.stream().min((x,y)->x.compareTo(y)).get();
        Integer maxn = nuners.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(intr);
        System.out.println(maxn);

    }

}
