package action;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.util.Properties;

import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.tiles.annotation.TilesDefinition;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import entity.Category;
import entity.Header;
import entity.Menu;
import entity.SubCategory;
import service.*;
public class HomeHeader extends HeaderService{
	
	 private static HomeHeader instance;
		
	 private HomeHeader() throws Exception {
			execute();
	 }
		
	 public static HomeHeader getInstance() throws Exception {
			if(instance == null) {
				instance = new HomeHeader();
			}
			return instance;
	 }
	 
	public String HeaderPage() {
		return "success";
	}

	
	@Override
	public String execute() throws Exception {
		getHeaderandMenu("C:\\Users\\Admin\\Desktop\\RiverCraneVietNam\\webike\\src\\main\\resources\\headers.properties");
		return "success";
	}
	
	public String pageTest() throws Exception {
		return "success";
	}
	
	
	public String pageHomePage() throws Exception {
		return "success";
	}

	
	
	
	
	
	

}
