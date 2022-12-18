/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidproject;

/**
 *
 * @author Piyaporn
 */
@WebService(serviceName = "SoapClass")
public class SoapClass {

    /**
     * This is a sample web service operation
     */
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SOAPServicePU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByYear")
    public Covidproject findByYear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Covidproject cov = em.find(Covidproject.class, year);
        return cov;
    }
}
