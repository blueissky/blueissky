package net.company.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import net.company.dao.InformationDao;
import net.company.vo.InformationVo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("informationDao")
public class InformationDaoImpl implements InformationDao {
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}
	private InformationVo informationVo;
	@Override
	public void save(InformationVo object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(InformationVo object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(InformationVo object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public InformationVo findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	//查询所有新闻信息
	@Override
	public List<InformationVo> findAll() {
		List<InformationVo> list=null;
		String sql="select * from information where enable=1";
		list=this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<InformationVo>(InformationVo.class));
		return list;
	}

	@Override
	public List<InformationVo> findAll(InformationVo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InformationVo> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InformationVo> findPage(int pageNo, int pageSize,
			InformationVo object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDataCount(InformationVo object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void batchUpdate(List<InformationVo> objects) {
		// TODO Auto-generated method stub

	}

}
