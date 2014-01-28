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

  def "search notification by id"() {
    given:
      def templates = new Template(body:cuerpo).save(validate:false)
    and:
      def notification = new Notification()
      notification.to = receptor
      notification.sender = emisor
      notification.subject = asunto
      notification.save(validate:false)
    when:
      def result = service.searchNotificationById(notification.id)
    then:
      assert result.id > 0
      assert result.to == receptor
    where:
     cuerpo             | receptor              | emisor              | asunto
     "Holas del mar"    | "sergio@tumama.com"   | "felipe@tupapa.com" | "esPerraaaaaaattteeee!"
     "donde esta wally" | "sutanito@tumama.com" | "juan@tupapa.com"   | "super super duper"
  }

}
