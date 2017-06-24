package tx6.crm.crm1.coursetype.service.impl;

import java.util.List;

import com.itheima.crm.coursetype.dao.CourseTypeDao;
import com.itheima.crm.coursetype.domain.CrmCourseType;
import com.itheima.crm.coursetype.service.CourseTypeService;

public class CourseTypeServiceImpl implements CourseTypeService {

	private CourseTypeDao courseTypeDao;
	public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
		this.courseTypeDao = courseTypeDao;
	}
	@Override
	public List<CrmCourseType> findAll() {
		return courseTypeDao.findAll();
	}

}
