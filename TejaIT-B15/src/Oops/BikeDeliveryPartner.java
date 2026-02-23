package Oops;

public class BikeDeliveryPartner extends DeliveryPartner{

	public void WearHealmet() {
		System.out.println("bikedelivery partner wearhealmet");
		
		
	}
	
	 //  @Override //
	
	public void Deliverorder() {
		System.out.println("bikedeliverypartner deliver to the deliveryaddresses");
	}
	public static void main(String[] args) {
		
		BikeDeliveryPartner BDP=new BikeDeliveryPartner();
		
		
		BDP.AcceptOrder();
		BDP.PickupOrder();
		BDP.WearHealmet();
		BDP.Deliverorder();
	}
}
