package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import entity.Category;
import entity.Header;
import entity.Menu;
import entity.SubCategory;

public abstract class HeaderService {
	//list headers
	private List<Header> headers = new ArrayList<Header>();
	
	
	//list menus
	private List<Menu> menus = new ArrayList<Menu>();
	
	
	private String url = "";
	
	
	public abstract String execute() throws Exception;

	public List<Header> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
	public void getHeaderandMenu(String url) throws IOException {
		if(getMenus().isEmpty() && getHeaders().isEmpty()) {
			Properties defaultProps = new Properties();
			FileInputStream in = new FileInputStream(url);
			defaultProps.load(in);
			String menuList = "menu";
			String headerList = "header";
			
			//Khởi tạo list Menu
			List<String> Menus = new ArrayList<String>();
			
			List<String> listMenu = new ArrayList<String>();
			listMenu = getList(menuList, defaultProps);
			for(String nameMenu : listMenu) {
				String[] getStringMenu = nameMenu.split("\\.");
				Menus.add(getStringMenu[1]);
			}
			//System.out.println(Menus.toString());
			
			//Khởi tạo list Headers
			List<String> Headers = new ArrayList<String>();
			
			List<String> listHeader = new ArrayList<String>();
			listHeader = getList(headerList, defaultProps);
			for(String nameHeader : listHeader) {
				String[] getStringHeader = nameHeader.split("\\.");
				if(!Headers.contains(getStringHeader[1])) {
					Headers.add(getStringHeader[1]);
				}
				
			}
			//System.out.println(Headers.toString());
			

			//add Header Name
			for(String nameHeader : Headers) {
				List<String> getProperyList = getListPropertyByNameHeader(headerList,nameHeader,defaultProps);
				Header header = new Header();
				//System.out.println(getProperyList.toString());
				for(int i = 0 ; i< getProperyList.size() ; i++) {
					if(getProperyList.get(i).contains("http://")) {
						header.setUrl(getProperyList.get(i));
					}
					else if(getProperyList.get(i).contains("fa")) {
						header.setImage(getProperyList.get(i));
					}
					else {
						header.setName(getProperyList.get(i));
					}
				}
				getHeaders().add(header);	
			}
			
			
		
			
		    //ADD MENU
		    for(String nameMenu : Menus) {
		    	List<Category> categories = new ArrayList<Category>();
		    	//add Name Menu
		    	String ValueOfMenu = defaultProps.getProperty(menuList+"."+nameMenu);
		    	Menu menu = new Menu(ValueOfMenu);
		    	List<String> listMenu1 = getList(nameMenu, defaultProps);
		    	List<String> ListTypes = new ArrayList<>();
		    	List<String> ListSubTypes = new ArrayList<>();
		    	
		    	
		    	
		    	//tìm chữ sau dấu chấm với [1] sau 1 dấu chấm,[2] sau 2 dấu chấm
		    	for(String typeofMenu : listMenu1) {
		    		String[] getTypes = typeofMenu.split("\\.");
		    		if(!ListTypes.contains(getTypes[1])) {
		    			ListTypes.add(getTypes[1]);
		    		}
		    		//loại trừ các trường hợp trùng và thuộc tính name,url
		    		if(!ListSubTypes.contains(getTypes[2]) && !getTypes[2].equals("name") && !getTypes[2].equals("url")) {
		    			ListSubTypes.add(getTypes[2]);
		    		}
		    	}
		    	//Với [1] return về hãng vd như moto.honda sẽ lấy honda
		    	//Với [2] return về sub menu của hãng đó như 700c của honda .... 
		    	
		
		    	
		    	//add Sub Menu dựa trên list tìm chữ ()
		    	for(String NameOfType : ListTypes) {
		    		List<SubCategory> listsubCategories = new ArrayList<>();
		    		
		    		//tìm list matches dựa trên nameMenu(vd như moto,brand),NameOfType(vd honda) 
		    		List<String> listProperty = getListPropertyByNameHeader(nameMenu, NameOfType, defaultProps);	
		    		//return các list liên quan
		    		
		    		//sau khi đã xác định được list gồm các dữ liệu kiểu String.Kiểm tra thành phần và khởi tạo object
		    		Category category = new Category();
		    		for(int i = 0 ; i< listProperty.size(); i++) {
		    			//tìm xem dữ liệu có contains http không,có sẽ gán về kiểu URL của lớp category
		    			if(listProperty.get(i).contains("http")) {
		    				category.setUrl(listProperty.get(i));
		    			}
		    			//nếu không phải sẽ gán về title
		    			else {
		    				category.setTitle(listProperty.get(i));
		    			}
		    		}
		    		
		    		
		    		//add menu đa cấp
		    		for(String subType : ListSubTypes) {
		    			//tìm menu đa cấp của sub-menu dựa trên nameMenu(vd như moto,brand),NameOfType(vd honda),subType(vd như 700c,1000c) 
		    	    	 List<String> listSub = getSubMenu(nameMenu, NameOfType,subType, defaultProps);
		    	    	
		    	    	 //khởi tạo lớp subcategory
		    	    	 SubCategory subCategory = new SubCategory();
		    	    	 if(!listSub.isEmpty()) {
		    	    		 for(int i = 0 ; i< listSub.size();i++) {
		 	 	    	    	if(listSub.get(i).contains("http") && listSub.get(i) != null) {
		 	 	    	    		subCategory.setUrl(listSub.get(i));
		 	 	    	    	} else if(listSub.get(i) != null) {
		 	 	    	    		subCategory.setName(listSub.get(i));
		 	 	    	    	}
		 	 	    	    }
		    	    		 
		    	    		listsubCategories.add(subCategory);
		 	 	    	    category.setSub_categories(listsubCategories);
		    	    	 }
		    	    }
		    		categories.add(category);
		    	    
		    	}
		    	menu.setCategories(categories);
		    	getMenus().add(menu);
		    }
		}
	}
	
	
	public List<String> getList(String name,Properties properties){
		List<String> listName;
		listName = properties.entrySet().stream() .filter(e ->
		  e.getKey().toString().matches(name+".*" + ".*")) .map(e ->e.getKey().toString())
				  .collect(Collectors.toList());
		return listName;
	}
	
	public List<String> getListPropertyByNameHeader(String nametype,String nameHeader, Properties properties){
		List<String> listName;
		listName = properties.entrySet().stream() .filter(e ->
		  e.getKey().toString().matches(nametype+"."+nameHeader+".name") || 
		  e.getKey().toString().matches(nametype+"."+nameHeader+".url") || 
		  e.getKey().toString().matches(nametype+"."+nameHeader+".image")
				) .map(e ->e.getValue().toString())
				  .collect(Collectors.toList());
		return listName;
	}
	
	public List<String> getSubMenu(String nametype,String nameHeader,String subName, Properties properties){
		List<String> listName;
		listName = properties.entrySet().stream() .filter(e ->
		  e.getKey().toString().matches(nametype+"."+nameHeader+"." + subName + ".name") || 
		  e.getKey().toString().matches(nametype+"."+nameHeader+"." + subName + ".url")) .map(e ->e.getValue().toString())
				  .collect(Collectors.toList());
		return listName;
	}
}
