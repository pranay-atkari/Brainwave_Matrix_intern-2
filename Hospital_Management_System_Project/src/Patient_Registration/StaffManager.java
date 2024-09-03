package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class StaffManager 
{
	 private Map<String, Staff> staffDatabase = new HashMap<>();

	    public void addStaff(Staff staff) {
	        staffDatabase.put(staff.getStaffId(), staff);
	    }

	    public Staff getStaff(String staffId) {
	        return staffDatabase.get(staffId);
	    }

	    public void updateStaff(Staff staff) {
	        staffDatabase.put(staff.getStaffId(), staff);
	    }

	    public void removeStaff(String staffId) {
	        staffDatabase.remove(staffId);
	    }
}
