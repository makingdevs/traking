package com.makingdevs

class RecordLogService {

    def createRecordLogAndSave(Notification notificationPerInstance) {
      def log = new RecordLog()
      log.notification = notificationPerInstance
      log.save(flush:true)
      log
    }
}
