package com.makingdevs

class NotificationService {

    def mailService

    def sendNotificationTo(def notification) {
      mailService.sendMail {
        from notification.sender
        bcc notification.to
        subject notification.subject
        html notification.template.body
      }
    }

    def createNewMailStructure(def mailStructureCommand) {
      def body = new Template(mailStructureCommand).save(flush:true)  
      def notification = new Notification(mailStructureCommand)
      notification.template = body
      notification.save(flush:true)
      notification
    }
}
