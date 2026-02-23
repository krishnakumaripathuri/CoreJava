package Oops;

public class DeliveryPartner {

	public void AcceptOrder() {
		System.out.println("acceptorder by delivery partner from the resturent");
	}
	
	public void PickupOrder() {
		System.out.println("pickup the order from the resturent by deliverypartner");
	}
	
	public void DeliverOrder() {
		System.out.println("deliverorder form the deliverypartner deliver to the deliveryaddresses");
	}
	
	public static void main(String[] args) {
		DeliveryPartner DP=new DeliveryPartner();
		
		DP.AcceptOrder();
		DP.PickupOrder();
		DP.DeliverOrder();
			
		
	}
}

