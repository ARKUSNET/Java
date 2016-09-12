package lesson03;

import ru.webapp.model.Contact;
import ru.webapp.model.ContactType;
import ru.webapp.model.Link;

import java.lang.reflect.Field;

/**
 * Created by Айслу on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Contact c = new Contact(ContactType.HOME_PHONE, "123456");
        ContactType c2 = ContactType.ICQ;
        System.out.println(ContactType.ICQ == c2);
        String property = "url";
        Field f = null;
        Link link = new Link("fsdfs", "URL");
        System.out.println(link instanceof Link);
        System.out.println(Link.class.isInstance(link));
        System.out.println(link);
        Object someObject = link;
        for (Field field : someObject.getClass().getDeclaredFields()) {
            field.setAccessible(true); // You might want to set modifier to public first.
            Object value = field.get(someObject);
            if (value != null) {
                System.out.println(field.getName() + "=" + value);
            }
        }

        String a1 = "Ja" + "va";
        String a2 = "Java";
        System.out.println(a1 == a2);

        StringBuffer fill = new StringBuffer();
        for(int i = 0; i <  10; i++){
            fill.append("a");
        }
        System.out.println(fill);
    }
}
