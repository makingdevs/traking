grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.repos.md.url = "http://makingdevs.com:8081/nexus/content/repositories/thisdparty"
grails.project.repos.md.username = "deploymet"
grails.project.repos.md.password = "d3pl0ym3nt"

grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo name: "MakingDevs", root: "http://makingdevs.com:8081/nexus/content/repositories/thisdparty"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        // runtime 'mysql:mysql-connector-java:5.1.27'
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
    }

    plugins {
      compile ":resources:1.2" 
      build(":release:3.0.1",
            ":rest-client-builder:1.0.3") {
          export = false
      }
      build ':tomcat:7.0.47'
      compile ':hibernate:3.6.10.6'
      compile ':quartz:1.0-RC13'
      compile ':mail:1.0.1'
      test ':code-coverage:1.2.6'
      test(":spock:0.7") {
        exclude "spock-grails-support"
      }      
    }
}
