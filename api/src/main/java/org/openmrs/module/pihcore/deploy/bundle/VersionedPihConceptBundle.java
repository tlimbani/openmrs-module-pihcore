package org.openmrs.module.pihcore.deploy.bundle;

import org.openmrs.ConceptClass;
import org.openmrs.ConceptDatatype;
import org.openmrs.ConceptMapType;
import org.openmrs.ConceptSource;
import org.openmrs.module.metadatadeploy.MetadataUtils;
import org.openmrs.module.pihcore.deploy.bundle.CoreConceptMetadataBundle.ConceptClasses;
import org.openmrs.module.pihcore.deploy.bundle.CoreConceptMetadataBundle.ConceptDatatypes;
import org.openmrs.module.pihcore.deploy.bundle.CoreConceptMetadataBundle.ConceptMapTypes;
import org.openmrs.module.pihcore.deploy.bundle.CoreConceptMetadataBundle.ConceptSources;

import java.util.Locale;

/**
 * Convenience superclass that loads existing datatypes, classes, etc, from {@link CoreConceptMetadataBundle}.
 * Any concrete subclass needs to do @Required(CoreConeptMetadataBundle.class)
 */
public abstract class VersionedPihConceptBundle extends VersionedPihMetadataBundle {

    // capitalized this way so they look as close as possible to Locale.ENGLISH in code
    protected Locale locale_HAITI = new Locale("ht");
    protected Locale locale_SPANISH = new Locale("es");
    protected Locale locale_SWAHILI = new Locale("sw");

    protected ConceptDatatype notApplicable;
    protected ConceptDatatype text;
    protected ConceptDatatype coded;
    protected ConceptDatatype numeric;
    protected ConceptDatatype datetime;
    protected ConceptDatatype date;
    protected ConceptDatatype time;

    protected ConceptClass finding;
    protected ConceptClass diagnosis;
    protected ConceptClass question;
    protected ConceptClass misc;
    protected ConceptClass convSet;

    protected ConceptMapType sameAs;
    protected ConceptMapType narrowerThan;
    protected ConceptMapType broaderThan;

    protected ConceptSource pih;
    protected ConceptSource pihMalawi;
    protected ConceptSource ciel;
    protected ConceptSource snomedCt;
    protected ConceptSource snomedNp;
    protected ConceptSource snomedMvp;
    protected ConceptSource ampath;
    protected ConceptSource emrapi;
    protected ConceptSource mdrtb;

    @Override
    public void install() throws Exception {
        retrieveCoreMetadata();
        super.install();
    }

    /**
     * Most concept bundles won't want to do anything every time, so this default implementation is just a no-op.
     * @throws Exception
     */
    @Override
    protected void installEveryTime() throws Exception {
        // do nothing
    }

    protected void retrieveCoreMetadata() throws Exception {
        notApplicable = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.N_A);
        text = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.TEXT);
        coded = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.CODED);
        numeric = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.NUMERIC);
        datetime = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.DATETIME);
        date = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.DATE);
        time = MetadataUtils.existing(ConceptDatatype.class, ConceptDatatypes.TIME);

        finding = MetadataUtils.existing(ConceptClass.class, ConceptClasses.FINDING);
        diagnosis = MetadataUtils.existing(ConceptClass.class, ConceptClasses.DIAGNOSIS);
        question = MetadataUtils.existing(ConceptClass.class, ConceptClasses.QUESTION);
        misc = MetadataUtils.existing(ConceptClass.class, ConceptClasses.MISC);
        convSet = MetadataUtils.existing(ConceptClass.class, ConceptClasses.CONV_SET);

        sameAs = MetadataUtils.existing(ConceptMapType.class, ConceptMapTypes.SAME_AS);
        narrowerThan = MetadataUtils.existing(ConceptMapType.class, ConceptMapTypes.NARROWER_THAN);
        broaderThan = MetadataUtils.existing(ConceptMapType.class, ConceptMapTypes.BROADER_THAN);

        pih = MetadataUtils.existing(ConceptSource.class, ConceptSources.PIH);
        pihMalawi = MetadataUtils.existing(ConceptSource.class, ConceptSources.PIH_MALAWI);
        ciel = MetadataUtils.existing(ConceptSource.class, ConceptSources.CIEL);
        snomedCt = MetadataUtils.existing(ConceptSource.class, ConceptSources.SNOMED_CT);
        snomedNp = MetadataUtils.existing(ConceptSource.class, ConceptSources.SNOMED_NP);
        snomedMvp = MetadataUtils.existing(ConceptSource.class, ConceptSources.SNOMED_MVP);
        ampath = MetadataUtils.existing(ConceptSource.class, ConceptSources.AMPATH);
        emrapi = MetadataUtils.existing(ConceptSource.class, ConceptSources.EMRAPI_MODULE);
        mdrtb = MetadataUtils.existing(ConceptSource.class, ConceptSources.MDRTB_MODULE);
    }

}