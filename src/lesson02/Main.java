package lesson02;

import ru.webapp.model.Link;

/**
 * Created by Айслу on 08.09.2016.
 */
public class Main {
    public static void main(String[] args){
        Link link1 = new Link("JavaWebinar", "javawebinar.ru");
        Link link2 = link1;
        Link link3 = new Link(link1);
        System.out.println(link1.getClass());
        System.out.println(link1.equals(link2));
        System.out.println(link1.equals(link3));
        //link1.out();
        //link2.out();
    }
}
