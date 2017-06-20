package com.mycompany.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SivaKrrish
 */
public class Mail {
    
    private String Fromadd;
    private String Toadd;
    private String Subject;
    private String Message;
    
   // public Mail()
   // {
        
  //  }
    public String getFromadd() {
        return Fromadd;
    }

    public void setFromadd(String Fromadd) {
        this.Fromadd = Fromadd;
    }

    public String getToadd() {
        return Toadd;
    }

    public void setToadd(String Toadd) {
        this.Toadd = Toadd;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
public void clearFields() {
		this.Fromadd = "";
		this.Toadd = "";
		this.Subject = "";
		this.Message = "";
		
	}
    
  // public Mail(String Fromadd, String Toadd, String Subject, String Message) {
  //      this.Fromadd = Fromadd;
   //     this.Toadd = Toadd;
   //     this.Subject = Subject;
    //    this.Message = Message;
 // }
   
}
