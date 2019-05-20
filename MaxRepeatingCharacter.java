import java.util.*;
public class MaxRepeatingCharacter
{
    public static void main(String[] args) {
        String arr[] =  {"a","b","c","d","a","b","a"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        System.out.println("key : "+ maxEntry.getKey() + "value : "+ maxEntry.getValue());
	}
}
