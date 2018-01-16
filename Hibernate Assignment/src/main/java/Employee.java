

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Employee {
	
	@Id
	private int eid;
	
	@OneToMany
	private List<Expenses> expenses;
	
	public List<Expenses> getExpenses() {
		return expenses;
	}
	
	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int i) {
		this.salary = i;
	}
	private String Name;
	private int salary;
	
	@OneToOne(cascade = (CascadeType.ALL),fetch= FetchType.EAGER)
	private Laptop laptop;
	

	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
