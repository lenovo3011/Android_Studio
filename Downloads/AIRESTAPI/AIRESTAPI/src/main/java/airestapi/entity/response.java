package airestapi.entity;

import org.springframework.stereotype.Repository;

@Repository

public class response {
	
	private int status ; 
//	private static String message = "Data found ! ";
	private data data ; 
	private description desc ; 
	
	
	public response (int status , data data , description desc) {
		this.status = status ;
		this.data = data ;
		this.desc = desc ; 
		
	}
	
	public response () {}
	
	
	
	public data getData() {
		return data;
	}


	public void setData(data data) {
		this.data = data;
	}


	public description getDesc() {
		return desc;
	}


	public void setDesc(description desc) {
		this.desc = desc;
	}


	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "response [status=" + status + ", data=" + data + ", desc=" + desc + ", getData()=" + getData()
				+ ", getDesc()=" + getDesc() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	


	

	// Methods 
	
	
}
