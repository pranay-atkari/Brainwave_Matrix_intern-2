package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class HealthRecordManager 
{
	 private Map<String, HealthRecord> recordDatabase = new HashMap<>();

	    public void addRecord(HealthRecord record) {
	        recordDatabase.put(record.getRecordId(), record);
	    }

	    public HealthRecord getRecord(String recordId) {
	        return recordDatabase.get(recordId);
	    }

	    public void updateRecord(HealthRecord record) {
	        recordDatabase.put(record.getRecordId(), record);
	    }

	    public void deleteRecord(String recordId) {
	        recordDatabase.remove(recordId);
	    }
}
