package net.company.action;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>,
		ServletRequestAware, ServletResponseAware, ServletContextAware,SessionAware,RequestAware {

	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return null;
	}
//类名前要加泛型<T>
	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	private Class<T> getClazz(){
		if(clazz==null){
			clazz=(Class<T>)((ParameterizedType)this.getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return clazz;
	}
	private T model;
	public BaseAction(){
		try {
			model=this.getClazz().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		
	}
}
