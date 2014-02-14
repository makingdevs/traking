package com.makingdevs

class ScheduledTask {

    Date schedulerTrigger
    String schedulerExpretion
    StatusScheduled statusScheduled
    Notification notification

    Date dateCreated
    Date lastUpdated

    static constraints = {
      schedulerTrigger nullable:false
      schedulerExpretion blank:false,nullable:false      
    }
}
