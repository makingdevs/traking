package com.makingdevs

class TrackingService {

    def notificationService
    def recordLongService

    def trackingNotificationBy(MailStructureCommand msc) {
      def notification = notificationService.createNewMailStructure(msc)
      notificationService.sendNotificationTo(notification)
            
    }
}
