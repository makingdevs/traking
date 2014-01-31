package com.makingdevs

class RecordLogService {

    def createRecorLogAndSave(Notification notificationPerInstance) {
      def log = new RecordLog(notification:notificationPerInstance).save(flush:true)
      log
    }
}
