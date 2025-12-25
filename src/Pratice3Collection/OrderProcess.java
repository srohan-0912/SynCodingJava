//QUESTION 5: Order Processing System (Advanced)
//📌 Problem
//Using:
//List<Order>
//Each order has:
//orderId, customer, amount, status
//Implement:
//Group orders by status
//Find total amount per customer
//Find customers with more than 3 orders
//Sort customers by total purchase amount
//Cancel all orders below a given amount


package Pratice3Collection;

public class OrderProcess {
private int orderId;
private String customer;
private int amt;
 String status;

OrderProcess(int orderId,String customer,int amt,String status){
	this.orderId=orderId;
	this.customer=customer;
	this.amt=amt;
	this.status=status;
}
public int getOrderId() {
	return orderId;
}
public String getCustomer() {
	return customer;
}
public int getAmt() {
	return amt;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status=status;
}
public String toString() {
	return "OrderId: "+orderId+", customer: "+customer+",amt: "+amt+", status: "+status;
}
}
