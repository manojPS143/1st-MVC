package mobile;

public class mobile {
	private String name;
	private String model;
	private String ram;
	private double price; 
	private String colour;
	private sim sim;
	
	public void display(){
		System.out.println("name");
		System.out.println("model");
		System.out.println("ram");
		System.out.println(price);
		System.out.println("colour");
		System.out.println("--------------------------");
		sim.s();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public sim getSim() {
		return sim;
	}
	public void setSim(sim sim) {
		this.sim = sim;
	}
	
	
		

}
