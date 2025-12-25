package Pratice3Collection;
import java.util.*;
public class OrderMain {
public static void main(String[] args) {
	List<OrderProcess> list=new ArrayList<>();
	list.add(new OrderProcess(1,"NJr",1000,"New"));
	list.add(new OrderProcess(2,"CR",2000,"Delivered"));
	list.add(new OrderProcess(3,"MB",3000,"New"));
	list.add(new OrderProcess(4,"Vini",4000,"Delivered"));
	list.add(new OrderProcess(5,"musiala",1000,"New"));
	list.add(new OrderProcess(6,"Vini",8000,"Delivered"));
	list.add(new OrderProcess(6,"Vini",8000,"Delivered"));
	list.add(new OrderProcess(10,"musiala",1000,"Delivered"));
	list.add(new OrderProcess(8,"musiala",6000,"New"));
	
	//1.Group orders by status
	Map<String,List<OrderProcess>> map=new HashMap<>();
	for(OrderProcess o:list) {
		if(map.containsKey(o.getStatus())) {
			map.get(o.getStatus()).add(o);
		}
		else {
			List<OrderProcess> temp=new ArrayList<>();
			temp.add(o);
			map.put(o.getStatus(),temp);
		}
	}
	System.out.println("\nGroup order status are:");
	for(String s:map.keySet()) {
		System.out.println(s+" -> "+ map.get(s));
	}
	//2.Find total amount per customer
	Map<String,Double> mapAvg=new HashMap<>();
	for(OrderProcess s:list) {
		mapAvg.put(s.getCustomer(), mapAvg.getOrDefault(s.getCustomer(),0.0)+s.getAmt());
	}
	System.out.println("\nTotal Amount:");
	for(String s:mapAvg.keySet()) {
		System.out.println(s+" -> "+mapAvg.get(s));
	}
	
	//3.Find customers with more than 3 orders
	Map<String,Integer> cntMap=new HashMap<>();
	for(OrderProcess o:list) {
		cntMap.put(o.getCustomer(),cntMap.getOrDefault(o.getCustomer(),0)+1);
	}
	System.out.println("\n customer with more than 3 order:");
	for(String s:cntMap.keySet()) {
		if(cntMap.get(s) >= 3) {
		System.out.println(s);
		}
	}
	//4. Sort customers by total purchase amount
	List<Map.Entry<String,Double>> mapTot=new ArrayList<>(mapAvg.entrySet());
	Collections.sort(mapTot,(a,b)->Double.compare(b.getValue(),a.getValue()));
	System.out.println("\nSorted customer By tot purchase Amount: ");
	for(Map.Entry<String,Double> e:mapTot) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	//5.Cancel all orders below a given amount
	int minAmt=2000;
	System.out.println("\nMinimum amout cancellation:");
	for(OrderProcess o:list) {
		if(o.getAmt()<minAmt) {
			o.setStatus("cancelled");
			System.out.println(o);
		}
	}
	System.out.println("\nFinal List:");
	for(OrderProcess o:list) {
		System.out.println(o);
	}
	
}
}
