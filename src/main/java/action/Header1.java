package action;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import entity.Category;
import entity.Header;
import entity.Menu;
import entity.SubCategory;
import service.HeaderService;

public class Header1 extends HeaderService{
	
	 private static Header1 instance;
		
	 private Header1() throws Exception {
			execute();
	 }
		
	 public static Header1 getInstance() throws Exception {
			if(instance == null) {
				instance = new Header1();
			}
			return instance;
	 }
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		getHeaderandMenu("C:\\Users\\Admin\\Desktop\\RiverCraneVietNam\\webike\\src\\main\\resources\\header1.properties");
		return "success";
	}

}
