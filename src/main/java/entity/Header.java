package entity;

import java.io.Serializable;

public class Header implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String url;
	private String image;
	public Header() {
		
	};
	
//	public Header(String name,String url) {
//		this.name = name;
//		this.url = url;
//	}
	
	public Header(String name,String url,String image) {
		this.name = name;
		this.url = url;
		this.image = image;
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
	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Header [name=" + name + ", url=" + url + ", image=" + image + "]";
	}

	
	
	
	
}

