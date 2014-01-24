package com.makingdevs

import grails.transaction.Transactional

@Transactional
class NotificationService {

    def mailService

    def sendNotificationTo(Notification notification) {
      mailService.sendMail {
        from notification.from
        bcc notification.to
        subject notification.subject
        html notification.template
      }
    }
}
