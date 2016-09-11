package lesson03;

import ru.webapp.model.Contact;
import ru.webapp.model.ContactType;

/**
 * Created by Айслу on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Contact c = new Contact(ContactType.HOME_PHONE, "123456");
        ContactType c2 = ContactType.ICQ;
        System.out.println(ContactType.ICQ == c2);
    }
}
