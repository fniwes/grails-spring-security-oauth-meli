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

import org.scribe.builder.api.DefaultApi20
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.JsonTokenExtractor
import org.scribe.utils.OAuthEncoder;
import org.scribe.model.*;

class MeliApi extends DefaultApi20 {
	private static final String AUTHORIZE_URL = 
		"http://auth.mercadolibre.com.ar/authorization?response_type=code&client_id=%s&redirect_uri=%s";
    

	@Override
    public String getAccessTokenEndpoint() {
        return "https://api.mercadolibre.com/oauth/token?grant_type=authorization_code"
    }

    @Override
    public Verb getAccessTokenVerb() {
    	return Verb.POST;
  	}


    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
        String.format(
        	AUTHORIZE_URL, 
        	config.getApiKey(), 
        	OAuthEncoder.encode(config.getCallback())
    	)
    }

    @Override
    public AccessTokenExtractor getAccessTokenExtractor() {
    	return new MeliAccessTokenExtractor()
    }
}	

class MeliAccessTokenExtractor extends JsonTokenExtractor {
    public Token extract(String response) {
    	return super.extract(response)
    }
}