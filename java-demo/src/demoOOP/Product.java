package demoOOP;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product 
{
	public static final Comparator<Product> BY_WEIGHT 
	    = comparing(Product::getWeight);
	
	public static final Comparator<Product> BY_NAME = comparing(Product::getName);
	
	
	
	// public int compare(final Product p1, final Product p2)
	// {
	//     return Integer.compare(p1.getWeight(), p2.getWeight());
	// }
	
    private final int id;
	private final String name;
	private final int weight;
	
	public Product(final int id, final String name,final int weight) 
	{
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getWeight() 
	{
		return weight;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name) && weight == other.weight;
	}

	
	
	
	
	
	
	
	
	
	
}
