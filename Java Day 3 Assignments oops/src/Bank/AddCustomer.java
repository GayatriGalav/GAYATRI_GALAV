package Bank;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;




public class AddCustomer {
	
	public void printCustomers(List<String> arrayList){

		
		Iterator<String> iterator=arrayList.iterator(); 
		System.out.println("Customers are : "); 
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
		
		public static void main(String args[]){

		
			List<String> list=new ArrayList<String>();
			list.add("Sam");
			list.add("Rez");
			list.add("Tira");
			list.add("Bob");
			AddCustomer addCustomer=new AddCustomer();
			addCustomer.printCustomers(list);
		
		}
		}