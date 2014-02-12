package com.makingdevs

class Notification {

    String to
    String sender 
    String subject
    Template template

    Date dateCreated
    Date lastUpdated  

    static constraints = {
      to nullable:false
      sender blank:false, nullable:false
      subject nullable:false      
    }
}
