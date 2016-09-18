package ru.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.webapp.WebAppException;
import ru.webapp.model.Contact;
import ru.webapp.model.ContactType;
import ru.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Айслу on 16.09.2016.
 */
public abstract class AbstractStorageTest {
    private Resume R1, R2, R3;
    protected ArrayStorage storage = new ArrayStorage();

//    static {
//
//    }

    @BeforeClass
    public static void beforeClass(){
        // the same as static {}
    }

    @Before
    public void before(){
        R1 = new Resume("Полное Имя1", "location1");
        R1.addContact(new Contact(ContactType.MAIL, "mail@ya.ru"));
        R1.addContact(new Contact(ContactType.PHONE, "11111"));
        R2 = new Resume("Полное Имя2", null);
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "2222"));
        R3 = new Resume("Полное Имя3", null);
        storage.Clear();
        storage.save(R3);
        storage.save(R1);
        storage.save(R2);
    }
    @Test
    public void clear() throws Exception {
        storage.Clear();
        assertEquals(0, storage.size());
    }

    @Test
    public void save() throws Exception {
        //for(int i = 0; )
    }

    @Test
    public void update() throws Exception {
        R2.setFullName("Updated N2");
        storage.update(R2);
        assertEquals(R2, storage.load(R2.getUuid()));
    }

    @Test
    public void load() throws Exception {
        assertEquals(R1, storage.load(R1.getUuid()));
        assertEquals(R2, storage.load(R2.getUuid()));
        assertEquals(R3, storage.load(R3.getUuid()));
    }

    @Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
    }

    @Test(expected = WebAppException.class)
    public void deleteNotFound() throws Exception{
        storage.load("dummy");
    }

    @Test(expected = WebAppException.class)
    public void deleteMissed() throws Exception{
        storage.delete("dummy");
    }

    @Test(expected = WebAppException.class)
    public void savePresented() throws Exception{
        storage.save(R1);
    }

    @Test(expected = WebAppException.class)
    public void updateMissed() throws Exception{
        Resume resume = new Resume("dummy", "fullName_U1", "location_U1");
        storage.update(resume);
    }

    @Test
    public void getAllSorted() throws Exception {
//        Resume[] src = new Resume[]{R1, R2, R3};
//        Arrays.sort(src);
//        assertArrayEquals(src, storage.getAllSorted().toArray());
        List<Resume> list = Arrays.asList(R1,R2,R3);
        Collections.sort(list);
        assertEquals(list, storage.getAllSorted());
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }


}
