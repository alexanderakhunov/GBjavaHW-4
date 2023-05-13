import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue()
 - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("EL001");
        ll.add("EL002");
        ll.add("EL003");
        ll.add("EL004");
        Scanner sc = new Scanner(System.in);

        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = sc.nextLine();
            switch (line) {
                case "Enqueue":
                    System.out.println("Новый элем: ");
                    String msg = sc.nextLine();
                    ll.addLast(msg);
                    break;
                case "Dequeue":
                    System.out.printf("Первый элемент: %s\n", ll.get(0));
                    System.out.println(ll.removeFirst());
                    break;
                case "First":
                    System.out.println(ll.get(0));
                    break;
                case "Print":
                    System.out.println(ll);
            }
        }
    }
}

