/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sendingemails;

import com.mycompany.Dao.MailDao;
import com.mycompany.Model.Mail;
import javax.servlet.http.HttpServletRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author SivaKrrish
 */
@Controller
@RequestMapping (value = "/sendEmail.do")
public class SendEmailController

{
    private JavaMailSender mailjava;
    public void setMailjava(JavaMailSender mailjava) {
        this.mailjava = mailjava;
    }
    private MailDao maildao;
    
    public void setMailDao(MailDao maildao) {
        this.maildao = maildao;
    }
  
    @RequestMapping ( method = RequestMethod.POST)
    public String doSendEmail(Model model,Mail mailbean)// Data Binding
   
    {
        SimpleMailMessage simplemail = new SimpleMailMessage();
        simplemail.setFrom(mailbean.getFromadd());
        simplemail.setTo(mailbean.getToadd());
        simplemail.setSubject(mailbean.getSubject());
        simplemail.setText(mailbean.getMessage());
            try{
                  this.mailjava.send(simplemail);
                }
                catch(Exception e)
                {
                     System.out.println(e.getMessage());
                }
        maildao.insert(mailbean);
        int Count = maildao.getMailCount();
	System.out.println(Count);
        mailbean.clearFields();
        model.addAttribute("cnt", Count);
        return "Result";
       }
}
