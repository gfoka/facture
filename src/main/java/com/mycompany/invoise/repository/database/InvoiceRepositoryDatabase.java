package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices=new ArrayList<>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Database : Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
        /**
         * Ici la requette pour engistrer dans la base de données
         */
    }
}
