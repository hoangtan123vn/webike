package action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.tiles.annotation.TilesDefinition;
import org.apache.struts2.tiles.annotation.TilesPutAttribute;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import entity.Header;
import entity.Menu;

public class HomeAction extends ActionSupport implements Preparable{
	/**
	 * 
	 */

    Header1 header1;
    HomeHeader header;
    
	public Header1 getHeader1() {
		return header1;
	}


	public void setHeader1(Header1 header1) {
		this.header1 = header1;
	}

	public void setHeader(HomeHeader header) {
		this.header = header;
	}

	public HomeHeader getHeader() {
		return header;
	}


	public String execute() throws Exception {
		return "success";
	}
	
	public String pageHomePage() throws Exception {
		return "success";
	}
	
	@Override
	public String toString() {
		return "HomeAction [header1=" + header1 + ", header=" + header + "]";
	}


	@Override 
	  public void prepare() throws Exception { // TODO Auto-generated
		//  if(headerAction.getHeaders())
//		  if(menus.isEmpty() || headers.isEmpty()) {
//				menus = headerAction.getMenus();
//				headers = headerAction.getHeaders();
//		  }
	  }
	 
	
	
	
}
