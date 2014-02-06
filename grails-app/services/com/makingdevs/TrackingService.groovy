package com.makingdevs

class TrackingService {

    def notificationService
    def recordLongService

    def trackingNotificationBy(MailStructureCommand msc) {
      def notification = notificationService.createNewMailStructure(msc)
      def responseOfSendMail = notificationService.sendNotificationTo(notification)
      if (responseOfSendMail) {
        def responseOfLog = recordLongService recordLongService.createRecordLogAndSave(notification) 
      }
    }
}
