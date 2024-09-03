package Patient_Registration;

import java.time.LocalDateTime;

public class Appointment 
{
	private String appointmentId;
    private String patientId;
    private LocalDateTime appointmentTime;
    private String doctorId;
    
    public Appointment(String appointmentId, String patientId, LocalDateTime appointmentTime, String doctorId) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.appointmentTime = appointmentTime;
        this.doctorId = doctorId;
    }
    
   
    public String getAppointmentId() 
    { return appointmentId; }
    
    public void setAppointmentId(String appointmentId)
    { this.appointmentId = appointmentId; }
    
    public String getPatientId() 
    { return patientId; }
    
    public void setPatientId(String patientId)
    { this.patientId = patientId; }
    
    public LocalDateTime getAppointmentTime()
    { return appointmentTime; }
    
    public void setAppointmentTime(LocalDateTime appointmentTime)
    { this.appointmentTime = appointmentTime; }
    
    public String getDoctorId() 
    { return doctorId; }
    
    public void setDoctorId(String doctorId) 
    { this.doctorId = doctorId; }
    
    @Override
    public String toString() 
    {
        return "Appointment [ID=" + appointmentId + ", PatientID=" + patientId + ", Time=" + appointmentTime + ", DoctorID=" + doctorId + "]";
    }
}

