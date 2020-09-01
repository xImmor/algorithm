import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgorithmTestTest {

    @Test
    public void test() {
        List<Integer> integerList = Stream.of(4, 5, 6, 3, 4, 1, 8, 3, 5, 2, 0, 0, 0, 5, 3, 8, 4, 1, 0).collect(Collectors.toList());
        System.out.println(":::::" + integerList);
        List<Integer> integerSort = AlgorithmTest.bubbleSort(integerList);
        System.out.println("=====" + integerSort);
    }

}