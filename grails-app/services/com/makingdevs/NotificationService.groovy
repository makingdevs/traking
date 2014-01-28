package com.makingdevs

class NotificationService {

    def mailService

    def sendNotificationTo(Notification notification) {
      mailService.sendMail {
        from notification.sender
        bcc notification.to
        subject notification.subject
        html notification.template.body
      }
    }
}
