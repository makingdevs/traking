package com.makingdevs

import grails.test.mixin.*
import spock.lang.Specification
import static org.junit.Assert.*
import org.unit.*

@TestFor(TrackingService)
@Mock(MailStructureCommand)
class TrackingServiceSpec extends Specification {


  def "create a notification in base to command"() {
    given:
      def msc = new MailStructureCommand()
      
    when:
    then:
    where:
  }

}
