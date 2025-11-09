package airestapi.entity;

public class data {
	
	
	
	private String name ; 
	private String first_release ; 
	private String last_release ; 
	private String designed_by ;
	
	public data (String name , String fr , String lr , String db) {
		this.name = name ; 
		this.first_release = fr;
		this.last_release = lr ;
		this.designed_by = db ; 
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirst_release() {
		return first_release;
	}
	public void setFirst_release(String first_release) {
		this.first_release = first_release;
	}
	public String getLast_release() {
		return last_release;
	}
	public void setLast_release(String last_release) {
		this.last_release = last_release;
	}
	public String getDesigned_by() {
		return designed_by;
	}
	public void setDesigned_by(String designed_by) {
		this.designed_by = designed_by;
	}
	@Override
	public String toString() {
		return "data [name=" + name + ", first_release=" + first_release + ", last_release=" + last_release
				+ ", designed_by=" + designed_by + "]";
	} 

}
