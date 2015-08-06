package net.company.dao;

import net.company.vo.ManagerVo;

public interface ManagerDao extends CommonDao<ManagerVo> {
ManagerVo equalAccount(ManagerVo object);
}
