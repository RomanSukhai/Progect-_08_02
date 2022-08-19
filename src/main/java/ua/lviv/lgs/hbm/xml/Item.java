package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
	private Integer id ;
	private String total;
	private Set<Cart> set = new HashSet<Cart>();
	public Item() {
		
	}
	public Item(Integer id, String total) {
		super();
		this.id = id;
		this.total = total;
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
	public Set<Cart> getSet() {
		return set;
	}
	public void setSet(Set<Cart> set) {
		this.set = set;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, set, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(set, other.set) && Objects.equals(total, other.total);
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", total=" + total + ", set=" + set + "]";
	} 
	
	
}
