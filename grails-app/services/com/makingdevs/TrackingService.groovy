package com.makingdevs

class TrackingService {

    def notificationService
    def recordLogService

    def trackingNotificationBy(MailStructureCommand msc) {
      def notification = notificationService.createNewMailStructure(msc)
      def responseOfSendMail = notificationService.sendNotificationTo(notification)
      if (responseOfSendMail) {
        return recordLogService.createRecordLogAndSave(notification) 
      }
    }
}
