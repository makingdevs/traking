package com.makingdevs

class NotificationController {
    static scaffold = true
    def trackingService

    def show() {
      [nombre:"sergio"]
    }
   
    def notificationSend(MailStructureCommand msc) {
    def tracking = trackingService.trackingNotificationBy(msc)
    [trackings:tracking]
    }   
}
