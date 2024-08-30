package Bank;




import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class LoginDetails{

public void addSameKey(Map<Integer,String> map){
if(map.containsKey(103)){
System.out.println("Key is already present in map");
}
 



}

public void printLoginDetails(Map<Integer,String> map){

Set<Integer> set=map.keySet();
Iterator<Integer> iterator=set.iterator();






while(iterator.hasNext()){ System.out.println(iterator.next());
}
}

public static void main(String args[]){ Map<Integer,String> map=new
LinkedHashMap<Integer,String>();
map.put(100,"Bob"); map.put(101,"Rez"); map.put(102,"Ken"); map.put(103,"Benny");
System.out.println("Map before adding the same key 1003"+
map);
LoginDetails loginDetails=new LoginDetails();
loginDetails.addSameKey(map);
System.out.println("Value for 103, after addSameKey() : "+map.get(103));
System.out.println("Map after adding the same key 103"+
map);
loginDetails.printLoginDetails(map);
}
}

