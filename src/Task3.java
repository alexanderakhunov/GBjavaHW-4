import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(FillList(list));
        System.out.printf("Сумма всех элементов LinkedList =  %d\n",TotalList(list));
    }

    static LinkedList<Integer> FillList(LinkedList<Integer> list) {
        Random rand = new Random();
        int numb = 0;
        for (int i = 0; i < 4; i++) {
            numb = rand.nextInt(1, 5);
            list.add(numb);
        }
        return list;
    }

    static int TotalList(LinkedList<Integer> list) {
        int sum = 0;
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }
        return sum;
    }
}
