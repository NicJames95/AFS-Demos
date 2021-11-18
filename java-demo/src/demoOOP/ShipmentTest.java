package demoOOP;

import java.util.List;

import org.junit.jupiter.api.Test;


public class ShipmentTest 
{
	private Shipment shipment = new Shipment();
	public static Product door = new Product(0, "Wooden Door", 35);
	public static Product floorPanel = new Product(0, "Floor Panel", 25);
	public static Product window = new Product(0, "Glass Window", 10);
	
	@Test
	public void shouldAddItems() throws Exception
	{
		shipment.add(door);
		shipment.add(window);
		
		//assertThat(shipment, contains(door, window));
	}
	
	@Test
	public void shouldReplaceItems() throws Exception
	{
		shipment.add(door);
		shipment.add(window);
		
		shipment.replace(door, floorPanel);
	}
	
	@Test
	public void shouldNotReplaceMissingItems() throws Exception
	{
		shipment.add(window);
		
		shipment.replace(door, floorPanel);
		
		//assertThat(shipment, contains(window));
	}
	
	

	@Test
	public void shouldIdentifyVanRequirements() throws Exception
	{
		shipment.add(door);
		shipment.add(window);
		shipment.add(floorPanel);
		
		shipment.prepare();
		
		//assertThat(shipment.getLightVanProducts(), contains(window));
		//assertThat(shipment.getHeavyVanProducts(), contains(floorPanel, door));
	}

	
	

}
