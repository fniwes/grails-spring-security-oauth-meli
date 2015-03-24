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
package grails.plugin.springsecurity.oauth

import grails.converters.JSON
import groovy.json.JsonSlurper

class MeliSpringSecurityOAuthService {
	def oauthService

    def createAuthToken(accessToken) {
    	def response = oauthService.getMeliResource(accessToken, 'https://api.mercadolibre.com/users/me', [:], [Accept: "application/json"])
    	def user

    	try {
    		user = JSON.parse(response.body)
    	}
    	catch(Exception e) {
    		log.error "Error parsing response from Meli. Response:\n${response.body}"
    		throw new OAuthLoginException('Error parsing response from Meli', e)
    	}

        return new MeliOAuthToken(accessToken, user.nickname)
    }
}