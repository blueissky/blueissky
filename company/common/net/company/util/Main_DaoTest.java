package net.company.util;

import java.util.List;

import net.company.dao.InformationDao;
import net.company.vo.InformationVo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_DaoTest {

	/**
	 * @param args
	 */
////////////////////////////////////////////////////////≤‚ ‘
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//	ManagerDao managerDao=(ManagerDao)ac.getBean("managerDao");
//	ManagerVo managerVo=new ManagerVo();
//	managerVo.setUsername("admin1");
//	managerVo.setPassword("admin");
//	managerVo=managerDao.equalAccount(managerVo);
//	System.out.println(managerVo.getName());
	InformationDao informationDao=(InformationDao)ac.getBean("informationDao");
	InformationVo informationVo=new InformationVo();
	List<InformationVo> list=null;
	list=informationDao.findAll();
	for (InformationVo informationVo2 : list) {
		System.out.println(informationVo2.getContent());
	}
//	managerVo.setName("¿Ó»˝");
//	managerVo.setTel("1396317777");
//	managerVo.setQq("998812412");
//	managerVo.setUsername("user");
//	managerVo.setPassword("user");
//	managerVo.setEmail("user@yu.com");
//	Timestamp time=new Timestamp(1);
//	managerVo.setTime(time);
//	managerDao.save(managerVo);
	
}

}
