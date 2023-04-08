package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Gilles FOKA
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoise.controller.web","com.mycompany.invoise.service.prefix","com.mycompany.invoise.repository.database"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();//L'implémentation de la fonction createInvoice() est definie dans le fichier applicationContext.xml
    }
}
