package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cart {

	private int id ;
	private String total,name;
	private Set<Item> set = new HashSet<Item>();
	
	public  Cart() {
		
	}
	
	public Cart(int id, String total, String name) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Item> getSet() {
		return set;
	}
	public void setSet(Set<Item> set) {
		this.set = set;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, set, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(set, other.set)
				&& Objects.equals(total, other.total);
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + ", set=" + set + "]";
	} 
	
	
	
	
	
	
	
}
