import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        for(Map.Entry<String,String> item : map.entrySet()){
            System.out.println(item.getKey() + ":" + item.getValue());
        }
        List<String> list = new ArrayList<>();
        list.add("l");
        list.add("l");
        list.add("l");
        for(int i = 0 ; i<list.size() ; i++ ){
            System.out.println(list.get(i));
        }
        Set<String> set = new HashSet<>(list);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("set 输出 ：" + iterator.next() );
        }

    }
}
