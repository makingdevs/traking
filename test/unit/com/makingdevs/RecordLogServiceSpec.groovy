package com.makingdevs

import grails.test.mixin.*
import spock.lang.Specification
import static org.junit.Assert.*
import org.unit.*

@TestFor(RecordLogService)
@Mock([Notification, RecordLog,Template])
class RecordLogServiceSpec extends Specification {

  def "create and save row in Record Log"() {
    given:
      def bodys = new Template().save(validate:false)
    and:
      def notificacionPerInstance = new Notification(body:bodys).save(validate:false)
    when:
      def log = service.createRecorLogAndSave(notificacionPerInstance)
    then:
      assert log instanceof RecordLog
  }

}
