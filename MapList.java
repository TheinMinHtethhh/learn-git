import java.util.*;
public class MapList{
    public static void main(String[] args) {
        Map<Integer,String>map = new TreeMap<Integer,String>();
        map.put(23, "hello");
        map.put(34,"world");
        List<Integer>key = new ArrayList<Integer>(map.keySet());
        List<String>value = new ArrayList<String>(map.values());
        List<Map.Entry<Integer,String>>entries = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());

        for(int i = 0;i<map.size();i++){
        System.out.println(entries);
       
        }
        for(Map.Entry<Integer,String>entry:entries){
            System.out.print(entry.getValue()+"\t");
        }

}
}