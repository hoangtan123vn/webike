package entity;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable{
	private String title;
	List<SubCategory> sub_categories;
	private String url;
	
	
	public Category() {
		
	}
	public Category(String title,String url) {
		this.title = title;
		this.url = url;
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Category [title=" + title + ", url=" + url + "]";
	}
	public List<SubCategory> getSub_categories() {
		return sub_categories;
	}
	public void setSub_categories(List<SubCategory> sub_categories) {
		this.sub_categories = sub_categories;
	}


}
