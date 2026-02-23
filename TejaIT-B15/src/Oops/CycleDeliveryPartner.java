package Oops;

public class CycleDeliveryPartner extends DeliveryPartner {

	public void EcoFriendly() {
		System.out.println("ecofriendly delivery to the cycledelivery partner");
	}
	
	// @Override //
	
	public void DeliverOrder() {
		System.out.println("deliverorder to the cycledelivery partner");
	}
	
	public static void main(String[] args) {
		
		CycleDeliveryPartner CDP=new CycleDeliveryPartner();
		
		CDP.AcceptOrder();
		CDP.PickupOrder();
		CDP.EcoFriendly();
		CDP.DeliverOrder();
	}
}
