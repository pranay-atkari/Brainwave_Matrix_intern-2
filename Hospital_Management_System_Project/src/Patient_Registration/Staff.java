package Patient_Registration;

public class Staff 
{
	private String staffId;
    private String name;
    private String position;

    public Staff(String staffId, String name, String position) {
        this.staffId = staffId;
        this.name = name;
        this.position = position;
    }

   
    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString() 
    {
        return "Staff [ID=" + staffId + ", Name=" + name + ", Position=" + position + "]";
    }
}
