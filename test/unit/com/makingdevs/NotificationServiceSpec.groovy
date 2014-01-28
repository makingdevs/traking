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

   /* def "Created a object Notification and invoke the method sendNotificationTo"() {
      given:
       def templates = new Template()
       templates.body = "super prueba" 
       templates.save(validate:false)
      and:
        def notification = new Notification()
        notification.to = ['sergio@makingdevs.com', 'says.rodriguez@gmail.com'] as String[]
        notification.from = "radamantyz_033@hotmail.com"
        notification.subject = "super duper prueba"
        notification.template = templates
        notification.save(validate:false)      
      and:
        def mailServiceSpec = monckFor(mailService)
        mailServiceSpec.demand.registrarte(1..1){obj -> }
        service.mailService = mailServiceSpec.createMock()
      when:
        service.sendNotificationTo(notification)
      then:
        println "hola"
    }*/


}
