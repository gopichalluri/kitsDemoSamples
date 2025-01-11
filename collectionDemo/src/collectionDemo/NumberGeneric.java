package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public interface NumberGeneric {
	public static void main(String[] args) {

		List<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		//list1.add(20.1);
		System.out.println(list1);
		
		List<Customer> custList=new ArrayList<Customer>();
		custList.add(new Customer(121, "Gopi", 10000.0d));
		custList.add(new Customer(122, "Ramesh", 20000.0d));
		System.out.println(custList);
	}

}
