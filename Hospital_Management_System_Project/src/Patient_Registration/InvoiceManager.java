package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class InvoiceManager 
{
	 private Map<String, Invoice> invoiceDatabase = new HashMap<>();

	    public void createInvoice(Invoice invoice) {
	        invoiceDatabase.put(invoice.getInvoiceId(), invoice);
	    }

	    public Invoice getInvoice(String invoiceId) {
	        return invoiceDatabase.get(invoiceId);
	    }

	    public void updateInvoice(Invoice invoice) {
	        invoiceDatabase.put(invoice.getInvoiceId(), invoice);
	    }

	    public void deleteInvoice(String invoiceId) {
	        invoiceDatabase.remove(invoiceId);
	    }
}
