package com.makingdevs

class RecordLogService {

    def createRecorLogAndSave(def notificationPerInstance) {
      def log = new RecordLog(notification:notificationPerInstance).save(flush:true)
      log
    }
}
