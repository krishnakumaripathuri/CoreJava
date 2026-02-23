package Oops;

public class CarDeliveryOrder extends DeliveryPartner {

	
	public void LargeOrderSupport() {
		System.out.println("largeordersupport to the delivery oder");
	}
	
	// @Override //
	
	public void DeliverOrder() {
		System.out.println("deliverorder to the cardelivery");
	}
	public static void main(String[] args) {
		CarDeliveryOrder CDP=new CarDeliveryOrder();
		
		CDP.AcceptOrder();
		CDP.PickupOrder();
		CDP.LargeOrderSupport();
		CDP.DeliverOrder();
	}
}
