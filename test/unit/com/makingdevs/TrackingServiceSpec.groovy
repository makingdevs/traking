package com.makingdevs

import grails.test.mixin.*
import spock.lang.Specification
import static org.junit.Assert.*
import org.unit.*

@TestFor(TrackingService)
@Mock([RecordLog,Notification])
class TrackingServiceSpec extends Specification {


  def "create a notification in base to command"() {
    given:
      def msc = new MailStructureCommand()
      msc.to = "s@s.com"
      msc.sender = "d@d.com"
      msc.subject = "susto"
      msc.body = "ohffojnndfnj"
    and:
      def mocks = createPartners()
    when:
      def result = service.trackingNotificationBy(msc) 
      mocks*.verify()
    then:
      assert result instanceof RecordLog
  }


  private def createPartners() {
    Notification notification = new Notification()
    RecordLog recordLog = new RecordLog()
    def notificationServiceMock = mockFor(NotificationService)
    notificationServiceMock.demand.createNewMailStructure(1..1){ obj -> return notification}
    notificationServiceMock.demand.sendNotificationTo(1..1){ obje -> return true}
    service.notificationService  = notificationServiceMock.createMock()
    
    def recordLogServiceMock = mockFor(RecordLogService)
    recordLogServiceMock.demand.createRecordLogAndSave(1..1){ objec -> return recordLog}
    service.recordLogService = recordLogServiceMock.createMock()
    [notificationServiceMock, recordLogServiceMock] 
  }
  
}
