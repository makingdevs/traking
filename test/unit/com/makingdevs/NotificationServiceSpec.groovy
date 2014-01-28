package com.makingdevs

import static org.junit.Assert.*
import grails.test.mixin.*
import org.unit.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(NotificationService)
@Mock([Notification,Template])
class NotificationServiceSpec extends Specification {

  def "Create new mail structure with params"() { 
    given:
      def params = [body:cuerpo,to:receptor,sender:emisor,subject:asunto ]
    when:
      def result = service.createNewMailStructure(params)
    then:
      assert result instanceof Notification
    where:
      cuerpo         | receptor            | emisor              | asunto
      "Holas del mar"| "sergio@tumama.com" | "felipe@tupapa.com" | "esPerraaaaaaattteeee!"
  }

}
