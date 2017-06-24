package tx6.crm.crm1.coursetype.service;

import java.util.List;

import com.itheima.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeService {
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<CrmCourseType> findAll();

}
