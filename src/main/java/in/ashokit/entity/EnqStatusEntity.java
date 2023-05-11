package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "AIT_ENQUIRY_STATUS")

public class EnqStatusEntity {
	
	@Id
	@GeneratedValue
	private Integer EnqId;
	
	private String EnqStatus;

	public Integer getEnqId() {
		return EnqId;
	}

	public void setEnqId(Integer enqId) {
		EnqId = enqId;
	}

	public String getEnqStatus() {
		return EnqStatus;
	}

	public void setEnqStatus(String enqStatus) {
		EnqStatus = enqStatus;
	}

	

}
