package org.openmrs.module.pihcore.config;

import org.junit.Test;
import org.openmrs.test.BaseModuleContextSensitiveTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConfigTest extends BaseModuleContextSensitiveTest{

    private Config config;

    @Test
    public void testComponentConfiguration() {
        config = new Config();
        assertThat(config.isComponentEnabled("clinicianDashboard"), is(true));
        assertThat(config.isComponentEnabled("patientRegistration"), is(true));
        assertThat(config.isComponentEnabled("missingComponent"), is(false));
        assertThat(config.getWelcomeMessage(), is("Welcome to the PIH EMR"));
        assertNull(config.getSite());
        assertFalse(config.shouldScheduleBackupReports());
    }

    @Test
    public void testReloadingConfiguration() {
        config = new Config();
        assertThat(config.getWelcomeMessage(), is("Welcome to the PIH EMR"));
        assertNull(config.getSite());
        config.reload(ConfigLoader.load("custom"));
        assertThat(config.getWelcomeMessage(), is("Hello custom!"));
        assertThat(config.getSite(), is(ConfigDescriptor.Site.LACOLLINE));
    }

    @Test
    public void testCustomizingFilenameViaRuntimeProperties() {
        runtimeProperties.setProperty(ConfigLoader.PIH_CONFIGURATION_RUNTIME_PROPERTY, "custom");
        config = new Config(ConfigLoader.loadFromRuntimeProperties());
        assertThat(config.isComponentEnabled("someComponent"), is(true));
        assertThat(config.isComponentEnabled("anotherComponent"), is(false));
        assertThat(config.isComponentEnabled("customComponent"), is(true));
        assertThat(config.getWelcomeMessage(), is("Hello custom!"));
        assertThat(config.getSite(), is(ConfigDescriptor.Site.LACOLLINE));
        assertFalse(config.shouldScheduleBackupReports());
        runtimeProperties.remove(ConfigLoader.PIH_CONFIGURATION_RUNTIME_PROPERTY);
    }

    @Test
    public void testCascadingConfigs() {
        runtimeProperties.setProperty(ConfigLoader.PIH_CONFIGURATION_RUNTIME_PROPERTY, "custom,override");
        config = new Config(ConfigLoader.loadFromRuntimeProperties());
        assertThat(config.isComponentEnabled("override"), is(true));
        assertThat(config.isComponentEnabled("someComponent"), is(false));
        assertThat(config.isComponentEnabled("customComponent"), is(false));
        assertThat(config.getWelcomeMessage(), is("Hello custom!"));
        assertThat(config.getSite(), is(ConfigDescriptor.Site.LACOLLINE));
        assertTrue(config.shouldScheduleBackupReports());
        runtimeProperties.remove(ConfigLoader.PIH_CONFIGURATION_RUNTIME_PROPERTY);
    }

}
