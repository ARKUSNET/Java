package ru.webapp.storage;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.webapp.model.Contact;
import ru.webapp.model.ContactType;
import ru.webapp.model.Resume;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorageTest {
    private static Resume R1, R2, R3;
    private ArrayStorage storage = new ArrayStorage();

    static {
        R1 = new Resume("Полное Имя1", "location1");
        R1.addContact(new Contact(ContactType.MAIL, "mail@ya.ru"));
        R1.addContact(new Contact(ContactType.PHONE, "11111"));
        R2 = new Resume("Полное Имя2", null);
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "2222"));
        R3 = new Resume("Полное Имя3", null);
    }

    @BeforeClass
    public static void beforeClass(){
        // the same as static {}
    }

    @Before
    public void before(){
        storage.Clear();
        storage.save(R1);
        storage.save(R2);
        storage.save(R3);
    }
    @Test
    public void clear() throws Exception {

    }

    @Test
    public void save() throws Exception {
        //for(int i = 0; )
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void load() throws Exception {

    }

    @Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
        Assert.assertEquals(null, storage.load(R1.getUuid()));
    }

    @Test
    public void getAllSorted() throws Exception {

    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }
}