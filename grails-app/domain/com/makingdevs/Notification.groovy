package com.makingdevs

class Notification {

    String to
    String from
    String subject
    Template template

    Date dateCreted
    Date lastUpdated  

    static constraints = {
      to nullable:false,blank:false
      from blank:false, nullable:false
      subject nullable:false      
    }
}
