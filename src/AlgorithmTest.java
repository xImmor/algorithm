import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgorithmTest {
    public static void main(String[] args) {
        List<Integer> integerList = Stream.of(4, 5, 6, 3, 4, 1, 8, 3, 5, 2).collect(Collectors.toList());
        System.out.println(":::::" + integerList);
        List<Integer> integerSort = insertionSort(integerList);
        System.out.println("=====" + integerSort);
    }

    /**
     * @param listArray
     * @return
     */
    public static List<Integer> insertionSort(List<Integer> listArray) {
        int length = listArray.size();
        Integer current, preIndex;
        for (int i = 1; i < length; i++) {
            preIndex = i - 1;
            current = listArray.get(i);
            while (preIndex >= 0 && listArray.get(preIndex) > current) {
                listArray.set(preIndex + 1, listArray.get(preIndex));
                preIndex--;
            }
            listArray.set(preIndex + 1, current);
        }
        return listArray;
    }

    /**
     * @param listArray
     * @return
     */
    public static List<Integer> bubbleSort(List<Integer> listArray) {
        int length = listArray.size();
        Integer temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (listArray.get(j) > listArray.get(j + 1)) {
                    temp = listArray.get(j);
                    listArray.set(j, listArray.get(j + 1));
                    listArray.set(j + 1, temp);
                }
            }
        }
        return listArray;
    }

    /**
     * @param listArray
     * @return
     */
    public static List<Integer> selectionSort(List<Integer> listArray) {
        int length = listArray.size();
        Integer minIndex, temp;
        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (listArray.get(j) < listArray.get(minIndex)) {
                    minIndex = j;
                }
            }
            temp = listArray.get(minIndex);
            listArray.set(minIndex, listArray.get(i));
            listArray.set(i, temp);
        }
        return listArray;
    }
}