package lesson03;

import ru.webapp.model.Link;
import ru.webapp.model.Resume;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Айслу on 11.09.2016.
 */
public class MainArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(array.length);
        System.out.println(array.getClass());
        System.out.println(Arrays.toString(array));

        Resume[] resumes = new Resume[10];
        System.out.println(resumes.length);
        System.out.println(resumes.getClass());



        Link l = new Link();
        ((Object[]) resumes)[0] = l;

    }
}
