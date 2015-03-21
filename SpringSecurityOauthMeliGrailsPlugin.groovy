/*
 * Copyright 2015 Fernando Ariel Niwes Naufal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class SpringSecurityOauthMeliGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.4 > *"

    // The plugin depends on SpringSecurityOauth
    def loadAfter = ['springSecurityOauth']

    def title = "Spring Security Oauth Meli Plugin" // Headline display name of the plugin
    def author = "Fernando Ariel Niwes Naufal"
    def authorEmail = "fernando@soluciones3f.com.ar"
    def description = '''\
Integrate [MercadoLibre|http://www.mercadolibre.com] to [Spring Security OAuth plugin|http://grails.org/plugin/spring-security-oauth].
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/spring-security-oauth-meli"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Soluciones 3f SRL", url: "http://www.soluciones3f.com.ar/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Fernando Aiel Niwes Naufal", email: "fernando@soluciones3f.com.ar" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
