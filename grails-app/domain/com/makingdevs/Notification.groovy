package com.makingdevs

class Notification {

    String receives
    String sender 
    String subject
    Template template

    Date dateCreated
    Date lastUpdated  

    static constraints = {
      receives nullable:false
      sender blank:false, nullable:false
      subject nullable:false      
    }
}
