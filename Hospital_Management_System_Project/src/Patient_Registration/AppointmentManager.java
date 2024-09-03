package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class AppointmentManager 
{
	 private Map<String, Appointment> appointmentDatabase = new HashMap<>();
	    
	    public void scheduleAppointment(Appointment appointment)
	    {
	        appointmentDatabase.put(appointment.getAppointmentId(), appointment);
	    }
	    
	    public Appointment getAppointment(String appointmentId) 
	    {
	        return appointmentDatabase.get(appointmentId);
	    }
	    
	    public void updateAppointment(Appointment appointment) 
	    {
	        appointmentDatabase.put(appointment.getAppointmentId(), appointment);
	    }
	    
	    public void cancelAppointment(String appointmentId) 
	    {
	        appointmentDatabase.remove(appointmentId);
	    }
}
