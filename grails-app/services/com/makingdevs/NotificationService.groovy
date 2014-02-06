package com.makingdevs

import com.makingdevs.NotificationNotFoundException

class NotificationService {

    def mailService

    def sendNotificationTo(def notification) {
     notification.to.toString().split(",").each{ addressee ->
        try {
          mailService.sendMail {
            from notification.sender
            bcc addressee 
            subject notification.subject
            html notification.template.body
          }
          return true
        } catch (NotificationNotFoundException excep ){
          return false
        }
      }
    }

    def createNewMailStructure(def mailStructureCommand) {
      def body = new Template(mailStructureCommand).save(flush:true)  
      def notification = new Notification(mailStructureCommand)
      notification.template = body
      notification.save(flush:true)
      notification
    }

    def searchNotificationById(def idNotification) {
       Notification.findById(idNotification.toLong())
    }

}
