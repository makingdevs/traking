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

    def sendNotificationTo(def notification, def modelo) {
      notification.to.toString().split(",").each{ addressee ->
        try {
          mailService.sendMail {
            from notification.sender
            bcc addressee 
            subject notification.subject
            html view: notification.template.body, model: modelo
          }
          return true
        } catch (NotificationNotFoundException excep ){
          return false
        }
      }
    }

    def createNewMailStructure(def mailStructureCommand) {
      def bodys = new Template()
      bodys.body = mailStructureCommand.body
      bodys.save(flush:true)
      def notification = new Notification()
      notification.to = mailStructureCommand.to
      notification.sender = mailStructureCommand.sender
      notification.subject = mailStructureCommand.subject
      notification.template = bodys
      notification.save(failOnError:true)
      notification
    }

    def searchNotificationById(def idNotification) {
       Notification.findById(idNotification.toLong())
    }

}
