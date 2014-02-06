package com.makingdevs

import grails.validation.Validateable

@Validateable
class MailStructureCommand {

  String to
  String sender
  String subject
  String body

  static constraints = {
    to nullable:false
    sender nullable:false
    subject nullable:false
    body nullable:false
  }  

}
