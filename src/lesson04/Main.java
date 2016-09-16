package lesson04;

import ru.webapp.model.Organization;
import ru.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

import static ru.webapp.model.Organization.*;

/**
 * Created by Айслу on 16.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Organization.Period();
        Map<String, Resume> map = new HashMap<String, Resume>();
        map.put("uuid", new Resume("uuid", "", ""));
        for(Map.Entry<String, Resume>entry: map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getKey());
        }

    }
}
