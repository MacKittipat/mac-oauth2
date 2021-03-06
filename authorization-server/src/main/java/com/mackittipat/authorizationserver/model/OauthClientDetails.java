package com.mackittipat.authorizationserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_client_details")
public class OauthClientDetails {

    @Id
    @Column(name="client_id")
    private String clientId;

    @Column(name="resource_ids")
    private String resourcesIds;

    @Column(name="client_secret")
    private String clientSecret;

    @Column(name="scope")
    private String scope;

    @Column(name="authorized_grant_types")
    private String authGrantType;

    @Column(name="web_server_redirect_uri")
    private String webServerRedirectUrl;

    @Column(name="authorities")
    private String authorities;

    @Column(name="access_token_validity")
    private int accessTokenValidity;

    @Column(name="refresh_token_validity")
    private int refreshTokenValidity;

    @Column(name="additional_information")
    private String additionalInformation;

    @Column(name="autoapprove")
    private String autoApprove;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResourcesIds() {
        return resourcesIds;
    }

    public void setResourcesIds(String resourcesIds) {
        this.resourcesIds = resourcesIds;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthGrantType() {
        return authGrantType;
    }

    public void setAuthGrantType(String authGrantType) {
        this.authGrantType = authGrantType;
    }

    public String getWebServerRedirectUrl() {
        return webServerRedirectUrl;
    }

    public void setWebServerRedirectUrl(String webServerRedirectUrl) {
        this.webServerRedirectUrl = webServerRedirectUrl;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public int getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(int accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public int getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(int refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(String autoApprove) {
        this.autoApprove = autoApprove;
    }
}
