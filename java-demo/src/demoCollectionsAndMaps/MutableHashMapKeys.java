package demoCollectionsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MutableHashMapKeys {

	public static void main(String[] args)
	{ 
		final Map<MutableString, String> brokenMap = new HashMap<>();
		
		final String value = "abc";
		
		final MutableString key = new MutableString(value);
		brokenMap.put(key, value);
		
		System.out.println(brokenMap.get(key));
		System.out.println(brokenMap);
		
		// dont use mutable keys in hashMaps changes abc key to def
		key.set("def");
		
		System.out.println(brokenMap.get(key));
		System.out.println(brokenMap);
		

	}
	
	private static class MutableString
	{
		private String value;
		
		public MutableString(final String value)
		{
			set(value);
		}
		
		public String get() { return value; }
		
		public void set(final String value)
		{
			Objects.requireNonNull(value);
			this.value = value;
		}

		@Override
		public int hashCode() {
			return Objects.hash(value);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MutableString other = (MutableString) obj;
			return Objects.equals(value, other.value);
		}

		@Override
		public String toString() {
			return "MutableString [value=" + value + "]";
		}
		
		
	}
	

}
