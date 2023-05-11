package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.DashboardResponse;
import in.ashokit.binding.EnquiryForm;
import in.ashokit.binding.EnquirySearchCriteria;
import in.ashokit.entity.StudentEnqEntity;

public interface EnquiryService {

	public List<String> getCourses();

	public List<String> getEnqStatuses();

	public DashboardResponse getDashboardData(Integer userId);

	public boolean saveEnquiry(EnquiryForm form, Integer userId);
	
	public StudentEnqEntity getStudentEnq(Integer eId);

	List<StudentEnqEntity> getEnquiries(Integer userId,EnquirySearchCriteria search);

}
