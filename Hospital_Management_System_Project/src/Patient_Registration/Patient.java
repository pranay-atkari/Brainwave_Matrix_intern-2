package Patient_Registration;



public class Patient 
{
	  private String patientId;
	    private String name;
	    private String contactNumber;
	    private String address;
	    
	    public Patient(String patientId, String name, String contactNumber, String address)
	    {
	        this.patientId = patientId;
	        this.name = name;
	        this.contactNumber = contactNumber;
	        this.address = address;
	    }

		public String getPatientId()
		{
			return patientId;
		}

		public void setPatientId(String patientId) 
		{
			this.patientId = patientId;
		}

		public String getName() 
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getContactNumber()
		{
			return contactNumber;
		}

		public void setContactNumber(String contactNumber)
		{
			this.contactNumber = contactNumber;
		}

		public String getAddress() 
		{
			return address;
		}

		public void setAddress(String address) 
		{
			this.address = address;
		}
		
		
		 public String toString() {
		        return "Patient [ID=" + patientId + ", Name=" + name + ", Contact=" + contactNumber + ", Address=" + address + "]";
		    }
		}


