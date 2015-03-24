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
    def documentation = "https://github.com/fniwes/grails-spring-security-oauth-meli"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Soluciones 3f SRL", url: "http://www.soluciones3f.com.ar/" ]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GITHUB", url: "https://github.com/fniwes/grails-spring-security-oauth-meli/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/fniwes/grails-spring-security-oauth-meli" ]

}
