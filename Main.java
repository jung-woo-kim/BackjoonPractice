import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = Integer.parseInt(sc.next());

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < Num; i++){
            array.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(array);

        for (int i = 0; i < Num; i++){
            System.out.println(array.get(i));
        }
    }
}
