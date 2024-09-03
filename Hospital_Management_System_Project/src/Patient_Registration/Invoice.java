package Patient_Registration;

public class Invoice
{
	 private String invoiceId;
	    private String patientId;
	    private double amount;
	    private boolean isPaid;

	    public Invoice(String invoiceId, String patientId, double amount, boolean isPaid) 
	    {
	        this.invoiceId = invoiceId;
	        this.patientId = patientId;
	        this.amount = amount;
	        this.isPaid = isPaid;
	    }

	    
	    public String getInvoiceId() { return invoiceId; }
	    public void setInvoiceId(String invoiceId) { this.invoiceId = invoiceId; }
	    
	    public String getPatientId() { return patientId; }
	    public void setPatientId(String patientId) { this.patientId = patientId; }
	    
	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }
	    
	    public boolean isPaid() { return isPaid; }
	    public void setPaid(boolean isPaid) { this.isPaid = isPaid; }

	    @Override
	    public String toString()
	    {
	        return "Invoice [ID=" + invoiceId + ", PatientID=" + patientId + ", Amount=" + amount + ", Paid=" + isPaid + "]";
	    }
}
