package net.company.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import net.company.dao.ManagerDao;
import net.company.vo.ManagerVo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
@Repository("managerDao")
public class ManagerDaoImpl implements ManagerDao {
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public void save(ManagerVo object) {
		String sql="insert into manager(name,tel,qq,username,password,email,time) values(:name,:tel,:qq,:username,:password,:email,:time)";
		SqlParameterSource paramSource=new BeanPropertySqlParameterSource(object);
		this.namedParameterJdbcTemplate.update(sql, paramSource);
	}

	@Override
	public void update(ManagerVo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ManagerVo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	}
	@Override
	public ManagerVo findById(Integer id) {
		ManagerVo temp = null;
		String sql = "select * from manager where id=?";
		try {
			temp = this.jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<ManagerVo>(ManagerVo.class),id);
		} catch (DataAccessException e) {			
			//e.printStackTrace();
		}	
		return temp;
	}

	@Override
	public List<ManagerVo> findAll() {
		return null;
	}

	@Override
	public List<ManagerVo> findAll(ManagerVo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManagerVo> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManagerVo> findPage(int pageNo, int pageSize, ManagerVo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDataCount(ManagerVo object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void batchUpdate(List<ManagerVo> objects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * 对比查看账户是否正确
	 */
	public ManagerVo equalAccount(ManagerVo object) {
		ManagerVo managerVo=null;
		String sql="select * from manager where username=? and password=? and enable='1'";
		try {
			managerVo=this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<ManagerVo>(ManagerVo.class),object.getUsername(),object.getPassword());
		} catch (DataAccessException e) {
		}
		return managerVo;
	}
}
