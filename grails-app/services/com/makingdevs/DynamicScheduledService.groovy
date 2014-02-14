package com.makingdevs

class DynamicScheduledService {

    def createdScheduledTask(def paramsRequest) {
      ScheduledTask task = new ScheduledTask()
      task.schedulerTrigger = paramsRequest.schedulerTrigger
      task.schedulerExpression = getExpression(params.schedulerTrigger).toString()
      task.statusScheduled = StatusScheduled.REGISTERED
      task.notification = Notification.get(paramsRequest.idNotification) 
    }

    private def getExpression(Date scheduledDate) {
      def date = new Date(scheduledDate.toString())
      def year = date.getAt(Calendar.YEAR)
      def month = date.getAt(Calenar.MONTH) + 1
      def day = date.getAt(Calendar.DAY_OF_MONTH)
      def hour = date.getAt(Calendar.HOUR)
      def minute = date.getAt(Calendar.MINUTE)
      return "* "+minute+" "+hour+" "+day+" "+month+" "+year
    }    

}
