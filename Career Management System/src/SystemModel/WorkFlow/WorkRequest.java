/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.WorkFlow;

/**
 *
 * @author Karan
 */


import SystemModel.ServiceProvider.ServiceProvider;
import SystemModel.ServiceSeeker.ServiceSeeker;
import SystemModel.Supplier.Supplier;
import SystemModel.Supplier.Supply;
import SystemModel.GlobalCommunity.GlobalCommunity;
import SystemModel.UserAccount.UserAccount;
import SystemModel.Creator.Creator;
import java.util.Date;


public class WorkRequest {
 
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date dateOfRequest;
    private Date dateOfResolving;
    private ServiceProvider serviceProvider;
    private ServiceSeeker serviceSeeker;
    private GlobalCommunity gCO;
    private Supplier supplier;
    private Supply supply;
    private Creator creator;

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ServiceSeeker getServiceSeeker() {
        return serviceSeeker;
    }

    public void setServiceSeeker(ServiceSeeker serviceSeeker) {
        this.serviceSeeker = serviceSeeker;
    }

    public GlobalCommunity getgCO() {
        return gCO;
    }

    public void setgCO(GlobalCommunity gCO) {
        this.gCO = gCO;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDateOfResolving() {
        return dateOfResolving;
    }

    public void setDateOfResolving(Date dateOfResolving) {
        this.dateOfResolving = dateOfResolving;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    
    @Override
    public String toString(){
        return status;
    }
    
}
