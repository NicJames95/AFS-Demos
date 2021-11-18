package demo;

import java.util.Objects;

public class BadHash
{
	private String value;
	private int hash;
	
	public BadHash(String value, int hash)
	{
		super();
		this.value = value;
		this.hash = hash;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(hash, value);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BadHash other = (BadHash) obj;
		return hash == other.hash && Objects.equals(value, other.value);
	}

	@Override
	public String toString() 
	{
		return "BadHash [value=" + value + ", hash=" + hash + "]";
	}
	
	

}
