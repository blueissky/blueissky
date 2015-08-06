package net.company.backstageaccount.action;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.company.action.BaseAction;
import net.company.action.CommonAction;
import net.company.dao.impl.ManagerDaoImpl;
import net.company.vo.ManagerVo;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
@Controller("AccountAction")
@Scope("prototype")
public class AccountAction extends BaseAction<ManagerVo> implements CommonAction {
	@Resource
	private ManagerDaoImpl managerDao;//自动注入
	private HttpSession session=null;
	private ManagerVo managerVo=new ManagerVo();
	//private Map sessionMap=ActionContext.getContext().getSession();
	private HttpServletRequest request;
	@Override
	/**
	 * 获得登陆页面的用户名和密码
	 */
	public ManagerVo getModel() {
		request.setAttribute("zhang",12);
		return managerVo;
	}
	public String login(){
		managerVo=managerDao.equalAccount(managerVo);
		if(managerVo!=null){
			session=ServletActionContext.getRequest().getSession();
			session.setAttribute("account",managerVo);
			return "success";
		}
		return "error";
	}
	
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	
	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findById() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
