package com.makingdevs

class ScheduledTask {

    Date schedulerTrigger
    String schedulerExpression
    StatusScheduled statusScheduled
    Notification notification

    Date dateCreated
    Date lastUpdated

    static constraints = {
      schedulerTrigger nullable:false
      schedulerExpression blank:false,nullable:false      
    }
}
