package tx6.crm.crm1.coursetype.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima.crm.coursetype.dao.CourseTypeDao;
import com.itheima.crm.coursetype.domain.CrmCourseType;

public class CourseTypeDaoImpl extends HibernateDaoSupport implements CourseTypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<CrmCourseType> findAll() {
		return this.getHibernateTemplate().find("from CrmCourseType");
	}

}
