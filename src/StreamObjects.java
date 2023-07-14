import javax.lang.model.type.IntersectionType;
import javax.xml.xpath.XPathVariableResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.List.of;

public class StreamObjects {
    public static void main(String[] args) {
        //----------------------------------------------------------
        //play with stream objects
     // Stream Api - Collection process , groupOfObject
        String [] name = {"Midhin " , "arh","agjhfgsdj","iio"};
        Stream<String > name1 = Stream.of(name);
        name1.forEach(i->{
            System.out.println(i);
        });
        Stream<Object> StreamBuilder= Stream.builder().build();

        IntStream atr= Arrays.stream(new int[]{2,3,4,5,56});
        atr.forEach(e ->{
            System.out.println(e);
        });
        List<Integer> ls2 = new ArrayList<>();
        ls2.add(55556);
        ls2.add(546);
        ls2.add(36);
        ls2.add(46);
        Stream<Integer> ls3 = ls2.stream();
        ls3.forEach(i->{
            System.out.print(i);
        });


    }
}
