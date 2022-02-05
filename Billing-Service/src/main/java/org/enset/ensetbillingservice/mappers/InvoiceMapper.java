package org.enset.ensetbillingservice.mappers;

import org.enset.ensetbillingservice.dto.InvoiceRequestDTO;
import org.enset.ensetbillingservice.dto.InvoiceResponseDTO;
import org.enset.ensetbillingservice.entities.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    Invoice fromInvoiceRequestDTO(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO fromInvoice(Invoice invoice);

}
