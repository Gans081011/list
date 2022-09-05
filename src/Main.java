import java.util.*;

public class Main {
    public static void main(String[] args) {
        filterOutOddNumbers();
        filterOutEvenNumbers();
        printSortWords();
        printFindDoubleWords();
    }

    public static void filterOutOddNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 1);
        numbers.add(1, 2);
        numbers.add(2, 33);
        numbers.add(3, 23);
        numbers.add(4, 6);
        numbers.add(5, 16);
        System.out.print("Задание 1, результат:" + " ");
        for (int i = 0; i < numbers.size(); i++) {
            int result = numbers.get(i);
            if (result % 2 != 0) {
                System.out.print(result + " ");
            }
        }
    }
    public static void filterOutEvenNumbers() {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(54);
        numbers.add(42);
        numbers.add(10);
        numbers.add(23);
        numbers.add(6);
        numbers.add(16);
        numbers.add(17);
        numbers.add(16);
        numbers.add(16);
        numbers.add(16);
        numbers.add(16);
        System.out.println();
        System.out.print("Задание 2 результат:" + " ");
        ArrayList<Integer> numbersSort = new ArrayList<Integer>(numbers);
        Collections.sort(numbersSort);

        for (int i = 0; i < numbers.size(); i++) {
            int result = numbersSort.get(i);
            if (result % 2 == 0) {
                System.out.print(result + " ");
            }
        }
    }

    public static void printSortWords() {
        HashSet<String> words = new HashSet<String>();
        words.add("гаргулья");
        words.add("апельсин");
        words.add("собака");
        words.add("гонг");
        words.add("гаргулья");
        words.add("гаргулья");
        words.add("гаргулья");
        System.out.println("");
        System.out.print("Задание 3: " + words.toString());
    }

    public static void printFindDoubleWords() {
        List<String> words = new ArrayList<String>(){};
        int count = 0;
        String str = "гаргулья";
        words.add("гаргулья");
        words.add("апельсин");
        words.add("собака");
        words.add("гонг");
        words.add("гаргулья");
        words.add("гаргулья");
        words.add("гаргулья");
        System.out.println("");
        for (int i = 0; i < words.size(); i++) {
            if(str.contains(words.get(i))){
                count++;
            }
        }
        System.out.print("Задание 4: " + count);
    }
}
