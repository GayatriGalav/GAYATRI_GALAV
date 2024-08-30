package Bank;

import java.util.Set;
import java.util.HashSet;


public class EntrySet{


public void printSetRecords(Set<String> set){
if(set.isEmpty()){
	System.out.println("Set is an empty set");
	}else {
		System.out.println("Set elements are :"+ set);
	}
}
public static void main(String args[]){

Set<String> set=new HashSet<String>();
set.add("First ");
set.add("Second ");
set.add("Third ");
set.add("First ");

EntrySet setDemo=new EntrySet ();
setDemo.printSetRecords(set);

Set<String> emptySet=new HashSet<String>();
setDemo.printSetRecords(emptySet);

}
}
