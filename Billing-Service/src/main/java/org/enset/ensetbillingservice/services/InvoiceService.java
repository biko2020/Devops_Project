package org.enset.ensetbillingservice.services;

import org.enset.ensetbillingservice.dto.InvoiceRequestDTO;
import org.enset.ensetbillingservice.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {
 // créer les methodes dont on a besoin dans ce service
    InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO  getInvoice(String invoiceId);
    List<InvoiceResponseDTO> invoiceByCustomerId(String customerId);
}

