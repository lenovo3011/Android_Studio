package airestapi.entity;

public class description {
	
	private String extension ; 
	private String typing_descipline ;
	private String license ;
	
	public description (String ext , String td , String lic) {
		this.extension  = ext ; 
		this.typing_descipline = td ; 
		this.license = lic ; 
		
	}
	
	@Override
	public String toString() {
		return "description [extension=" + extension + ", typing_descipline=" + typing_descipline + ", license="
				+ license + ", getExtension()=" + getExtension() + ", getTyping_descipline()=" + getTyping_descipline()
				+ ", getLicense()=" + getLicense() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getTyping_descipline() {
		return typing_descipline;
	}
	public void setTyping_descipline(String typing_descipline) {
		this.typing_descipline = typing_descipline;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}

}
