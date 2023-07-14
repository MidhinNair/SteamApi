import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
        //create a list and filter all even number. using stream.
        List<Integer> ls1= List.of(2,3,4,5,9); // cant change the list
        List<Integer> ls2 = new ArrayList<>();
        List<Integer> ls3 = Arrays.asList(12,44,677,8); // cant change the list
        ls2.add(55556);
        ls2.add(546);
        ls2.add(36);
        ls2.add(46);
        List<Integer> ls4 = new ArrayList<>();
        for(Integer I :ls3){
            if(I%2==0) ls4.add(I);
        }

        System.out.println(ls1);
        System.out.println(ls2);
        System.out.println(ls3);
        System.out.println("without Stream");
        System.out.println(ls4);
       // -------------------------------------------------------
        //using Stream
        Stream<Integer> stream = ls3.stream();
        List<Integer> ans = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("using Stream");
        System.out.println(ans);
        List<Integer> sns1= ls1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("New List" + sns1);
        List<Integer> ans3 =ls3.stream().filter(i->i>100).collect(Collectors.toList());
        System.out.println("List of number which are >100 "+ ans3);




    }
}
