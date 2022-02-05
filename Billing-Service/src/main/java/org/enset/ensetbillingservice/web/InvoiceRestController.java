package org.enset.ensetbillingservice.web;

import org.enset.ensetbillingservice.dto.InvoiceRequestDTO;
import org.enset.ensetbillingservice.dto.InvoiceResponseDTO;
import org.enset.ensetbillingservice.services.InvoiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(path="/api")

public class InvoiceRestController {

    private InvoiceService invoiceService;
    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

        @GetMapping(path = "/invoices/{id}")
        public InvoiceResponseDTO getInvoice(@PathVariable(name = "id")String invoiceId){
              return invoiceService.getInvoice(invoiceId);
        }

    @GetMapping(path = "/invoices/{customerId}")
    public List<InvoiceResponseDTO> getInvoiceByCustomer(@PathVariable String customerId){
        return invoiceService.invoiceByCustomerId(customerId);
    }

    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.save(invoiceRequestDTO);

    }
}
