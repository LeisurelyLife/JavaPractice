package container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rt on 2018/08/30.
 */
public class Iterator {

    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i = 0; i < 4; i++) {
            Map map = new HashMap();
            map.put("id", i);
            list.add(map);
        }

        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Map next = (Map) iterator.next();
            next.put("id", "xxx");
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }

}
