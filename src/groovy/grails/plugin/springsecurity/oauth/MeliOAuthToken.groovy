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
import org.scribe.model.Token

class MeliOAuthToken extends OAuthToken {

    public static final String PROVIDER_NAME = 'meli'
    private final String screenName = ''

    MeliOAuthToken(Token scribeToken, String nickname) {
        super(scribeToken)
        this.principal = this.tokenParams["user_id"]
        this.screenName = nickname
    }

    String getSocialId() {
        this.principal
    }

    String getScreenName() {
        this.screenName
    }

    String getProviderName() {
        PROVIDER_NAME
    }

}