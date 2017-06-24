package tx6.crm.crm1.coursetype.dao;

import java.util.List;

import com.itheima.crm.coursetype.domain.CrmCourseType;

public interface CourseTypeDao {
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<CrmCourseType> findAll();

}
