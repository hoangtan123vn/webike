package interceptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.URL;
import org.apache.struts2.dispatcher.mapper.DefaultActionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.protobuf.Value;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.inject.Inject;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

import action.HomeHeader;
import action.Header1;
import action.HomeAction;
import entity.Header;
import entity.Menu;
import javassist.expr.NewArray;
import service.HeaderService;

public class CustomInterceptor extends AbstractInterceptor {

	private Header1 header1;
    
	public void setHeader1(Header1 header1) {
		this.header1 = header1;
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
//		List<Header> headers =  (List<Header>) invocation.getInvocationContext().getSession().get("headerheaders");
//		List<Menu> menus =  (List<Menu>) invocation.getInvocationContext().getSession().get("headermenus");  
//		
		
	//	HeaderAction headerAction = new HeaderAction();
	//	headerAction.execute();	
		
	//	header = new HeaderManagesources();
//		HeaderAction headerAction1 = headerAction.getInstance();
//		headerAction = new HeaderAction();
		//System.out.println(headerAction);
//		System.out.println(header1.getMenus());
//		System.out.println(header1.getHeaders());
//		System.out.println(header);
//		System.out.println(header1);
		
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Map<String,List<Header>> headerMap = new HashMap<String,List<Header>>();
        Map<String,List<Menu>> menuMap = new HashMap<String,List<Menu>>();
//        headerMap.put("headers", headerAction.getHeaders());
//        menuMap.put("menus", headerAction.getMenus());
//        
        System.out.println(header1);
        
        headerMap.put("headers", header1.getHeaders());
        menuMap.put("menus", header1.getMenus());
        
        valueStack.push(headerMap);
        valueStack.push(menuMap);
       // System.out.println(headerAction.getHeaders());
	    return invocation.invoke();
	}


	



	

}
