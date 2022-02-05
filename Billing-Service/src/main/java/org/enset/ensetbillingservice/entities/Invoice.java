package org.enset.ensetbillingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Invoice {
   // declaré les proprietes de notre entite
 @Id
    private String id;
    private Date date;
    private BigDecimal amount;
    private String clientId;

    @Transient
    //l'objet cusstomer  pour recuperer les donnees customer
    private  Customer customer;

}
