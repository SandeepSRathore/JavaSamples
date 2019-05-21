import java.util.*;
public class AnagramStringsCheck
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	    String s1 = "LISTEN";
		String s2 = "SILENT";
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		HashMap<String,Integer> map2 = new HashMap<String,Integer>();
		for(int i=0;i<s1.length();i++){
		    if(map.containsKey(s1.charAt(i))){
		        map.put(String.valueOf(s1.charAt(i)) , map.get(s1.charAt(i))+1);
		    }else{
		        map.put(String.valueOf(s1.charAt(i)) , 1);
		    }
		}
		
		
		for(int i=0;i<s2.length();i++){
		    if(map2.containsKey(s2.charAt(i))){
		        map2.put(String.valueOf(s2.charAt(i)) , map2.get(s2.charAt(i))+1);
		    }else{
		        map2.put(String.valueOf(s2.charAt(i)) , 1);
		    }
		}
		System.out.println(map.equals(map2));
	}
}
