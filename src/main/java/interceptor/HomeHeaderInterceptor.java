package interceptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

import action.Header1;
import action.HomeHeader;
import entity.Header;
import entity.Menu;

public class HomeHeaderInterceptor extends AbstractInterceptor{
	private HomeHeader header;
	
	public void setHeader(HomeHeader header) {
		this.header = header;
	}
	
//	private Header1 header1;
//	
//	public void setHeader1(Header1 header1) {
//		this.header1 = header1;
//	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		    ValueStack valueStack = ActionContext.getContext().getValueStack();
	        Map<String,List<Header>> headerMap = new HashMap<String,List<Header>>();
	        Map<String,List<Menu>> menuMap = new HashMap<String,List<Menu>>();
//	        headerMap.put("headers", headerAction.getHeaders());
//	        menuMap.put("menus", headerAction.getMenus());
//	        
	        
	       // System.out.println(header1);
	        
	        headerMap.put("headers", header.getHeaders());
	        menuMap.put("menus", header.getMenus());
	        
	        valueStack.push(headerMap);
	        valueStack.push(menuMap);
	       // System.out.println(headerAction.getHeaders());
		    return invocation.invoke();
	}
	
}
