package org.openmrs.module.pihcore.config;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Object that encapsulates the options that can be configured on a per-installation basis
 */
public class ConfigDescriptor {

    public enum Country {
        HAITI, LIBERIA, OTHER
    }

    public enum Site {
        MIREBALAIS, LACOLLINE, PLEEBO, OTHER
    }

    @JsonProperty
    private String welcomeMessage;

    @JsonProperty
    private String dashboardUrl;

    @JsonProperty
    private Country country;

    @JsonProperty
    private Site site;

    @JsonProperty
    private Map<String, String> globalProperties;

    @JsonProperty
    private List<String> components;

    @JsonProperty
    private String providerIdentifierPrefix;

    @JsonProperty
    private Boolean scheduleBackupReports; // whether or not to schedule a set of reports to be exported to disk regularly as a backup in case of downtime (see scheduleBackupReports method in Mirebalais Module Activator), generally this should only be turned on on production

    @JsonProperty
    private RegistrationConfigDescriptor registrationConfig;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getDashboardUrl() { return dashboardUrl; }

    public void setDashboardUrl(String dashboardUrl) { this.dashboardUrl = dashboardUrl; }

    public Map<String, String> getGlobalProperties() {
        return globalProperties;
    }

    public void setGlobalProperties(Map<String, String> globalProperties) {
        this.globalProperties = globalProperties;
    }

    public List<String> getComponents() {
        if (components == null) {
            components = new ArrayList<String>();
        }
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String getProviderIdentifierPrefix() {
        return providerIdentifierPrefix;
    }

    public void setProviderIdentifierPrefix(String providerIdentifierPrefix) {
        this.providerIdentifierPrefix = providerIdentifierPrefix;
    }

    public Boolean getScheduleBackupReports() {
        return scheduleBackupReports;
    }

    public void setScheduleBackupReports(Boolean scheduleBackupReports) {
        this.scheduleBackupReports = scheduleBackupReports;
    }

    public RegistrationConfigDescriptor getRegistrationConfig() {
        if (registrationConfig == null) {
            registrationConfig = new RegistrationConfigDescriptor();
        }
        return registrationConfig;
    }

    public void setRegistrationConfig(RegistrationConfigDescriptor registrationConfig) {
        this.registrationConfig = registrationConfig;
    }
}
