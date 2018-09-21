package lms.code.dao;

import org.springframework.stereotype.Repository;

import lms.code.beans.LMS_Logs;
import lms.common.AbstractDao;

@Repository
public class LogDao extends AbstractDao{
	
	public final String GetLogsByDate = " from LMS_Logs where to_char(startTime,'yyyy-mm-dd') = '{0}' and to_char(endTime,'yyyy-mm-dd') = '{1}' and manager.staffID = {2}";
	
	public final String GetLogsByStaffID = " from LMS_Logs where manager.staffID = {0}";
	
	@Override
	public Class<?> getReferenceClass() {
		return LMS_Logs.class;
	}
}
