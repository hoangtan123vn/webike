package entity;

import java.io.Serializable;

public class SubCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String url;
	
	public SubCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public SubCategory(String name,String url) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "SubCategory [name=" + name + ", url=" + url + "]";
	}
	
	
	
	
}
