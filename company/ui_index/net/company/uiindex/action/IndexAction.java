package net.company.uiindex.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.company.action.BaseAction;
import net.company.action.CommonAction;
import net.company.dao.impl.InformationDaoImpl;
import net.company.vo.InformationVo;
import net.company.vo.NewsVo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
@Controller("IndexAction")
@Scope("prototype")
public class IndexAction extends BaseAction<NewsVo> implements CommonAction {

	@Resource(name="informationDao")
	private InformationDaoImpl informationDao;
	private InformationVo informationVo;
	private Map<String,Object> request;
	//查询公司简介信息
	public void findInformation(){
		List<InformationVo> list=null;
		list=informationDao.findAll();
		request.put("information",list);
	}
	//获得request
	@Override
	public void setRequest(Map<String, Object> request) {
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
