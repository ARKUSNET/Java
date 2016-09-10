package lesson02;

import ru.webapp.model.Link;

/**
 * Created by Айслу on 08.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        Link link1 = new Link("JavaWebinar", "javawebinar.ru");
//        Link link2 = link1;
//        Link link3 = new Link(link1);
//        System.out.println(link1.getClass());
//        System.out.println(link1.equals(link2));
//        System.out.println(link1.equals(link3));
//        System.out.println(link1);

        System.out.println(Link.EMPTY);
        System.out.println(Link.empty());
        //link1.out();
        //link2.out();
        char c = 'A';
        Integer obj = 5;
        printInt(obj);
    }

    static void printInt(int i) {
        System.out.println("Primitive: " + i);
    }
    static void printInt(Integer obj) {
        System.out.println("Object: " + obj);
    }
}
