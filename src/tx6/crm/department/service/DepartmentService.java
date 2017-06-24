package tx6.crm.department.service;

import java.util.List;

import com.itheima.crm.department.domain.CrmDepartment;

public interface DepartmentService {
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<CrmDepartment> findAll();

}
