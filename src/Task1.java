
import java.util.LinkedList;
import java.util.ListIterator;
/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам.
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("EL01");
        list.add("EL02");
        list.add("EL03");
        list.add("EL04");
        System.out.println(list);
        System.out.println(ReverseList(list));
    }

    static LinkedList<String> ReverseList(LinkedList<String> list) {
        LinkedList<String> revList = new LinkedList<>();
        ListIterator <String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            revList.add(listIterator.previous());
        }
return revList;
    }
}
