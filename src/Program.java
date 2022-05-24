import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("Яблоко Слово");
        arrayList.add("Апельсин");
        arrayList.add("Слово");
        arrayList.add("Ананас Слово");
        arrayList.add("Виноград");
        System.out.println(arrayList);
        System.out.println(getElementsByWord(arrayList, "Слово"));


    }

    public static ArrayList<String> getElementsByWord(ArrayList<String> arr, String world) {
        return(ArrayList<String>)arr.stream().filter(a -> a.contains(world)).collect(Collectors.toList());
          }
}
