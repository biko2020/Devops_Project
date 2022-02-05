package org.enset.ensetbillingservice.services;

import org.enset.ensetbillingservice.dto.InvoiceRequestDTO;
import org.enset.ensetbillingservice.dto.InvoiceResponseDTO;
import org.enset.ensetbillingservice.mappers.InvoiceMapper;
import org.enset.ensetbillingservice.openfeign.CustomerRestClient;
import org.enset.ensetbillingservice.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional


public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceRepository invoiceRepository;
    private InvoiceMapper invoiceMapper;
    private CustomerRestClient customerRestClient;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper, CustomerRestClient customerRestClient) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
        this.customerRestClient = customerRestClient;
    }

    @Override
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) {
        return null;
    }

    @Override
    public InvoiceResponseDTO getInvoice(String invoiceId) {
        return null;
    }

    @Override
    public List<InvoiceResponseDTO> invoiceByCustomerId(String customerId) {
        return null;
    }
}
