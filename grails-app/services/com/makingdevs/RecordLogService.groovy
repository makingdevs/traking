package com.makingdevs

class RecordLogService {

    def createRecordLogAndSave(Notification notificationPerInstance) {
      def log = new RecordLog(notification:notificationPerInstance).save(flush:true)
      log
    }
}
