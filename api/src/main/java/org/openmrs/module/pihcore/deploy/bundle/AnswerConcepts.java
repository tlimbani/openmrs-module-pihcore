package org.openmrs.module.pihcore.deploy.bundle;

import org.openmrs.api.ConceptNameType;
import org.openmrs.module.metadatadeploy.builder.ConceptBuilder;
import org.openmrs.module.metadatadeploy.builder.ConceptMapBuilder;
import org.openmrs.module.metadatadeploy.bundle.Requires;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Includes miscellaneous answers to questions.
 * Note that a few very common answers (e.g. Yes, No, Other-non-coded) are defined in {@link CommonConcepts}
 */
@Component
@Requires({CoreConceptMetadataBundle.class})
public class AnswerConcepts extends VersionedPihConceptBundle {

    @Override
    public int getVersion() {
        return 1;
    }

    public static final class Concepts {
        public static final String NURSE = "1577AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String DOCTOR = "1574AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String COMMUNITY_HEALTH_WORKER = "bf997029-a496-41a2-a7e7-7981e82d2dd0";
        public static final String HOME = "987be8c8-6a5a-11e2-b6f9-aa00f871a3e1";
        public static final String HOSPITAL = "3ce0d472-26fe-102b-80cb-0017a47871b2";
        public static final String OUTSIDE_OF_INSTITUTION = "a49e7854-aed5-45eb-bd32-612f9938ef3d";
        public static final String FAMILY_MEMBER = "7e32130b-5be8-4766-bf03-f1b909934141";
        public static final String POLICE = "a1e44baf-c82f-4d4f-ac09-232da84c8a28";
        public static final String SURGERY = "a2bbe648-8b69-438a-9657-8148478cf951";
        public static final String FATHER = "3ce18444-26fe-102b-80cb-0017a47871b2";
        public static final String MOTHER = "3ce185ca-26fe-102b-80cb-0017a47871b2";
        public static final String BROTHER = "3ce18746-26fe-102b-80cb-0017a47871b2";
        public static final String SISTER = "3ce188f4-26fe-102b-80cb-0017a47871b2";
        public static final String SIBLING = "3ce18a70-26fe-102b-80cb-0017a47871b2";
        public static final String PARTNER_OR_SPOUSE = "3cee77da-26fe-102b-80cb-0017a47871b2";
        public static final String GUARDIAN = "3cde7c90-26fe-102b-80cb-0017a47871b2";
        public static final String OTHER_RELATIVE = "3ce18bec-26fe-102b-80cb-0017a47871b2";
    }

    @Override
    protected void installNewVersion() throws Exception {
        install(new ConceptBuilder(Concepts.NURSE)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("1848BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "Nurse", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("1849BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "Infirmière", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("1437FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "Trained nurse personnel", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("8f123093-5759-45aa-b96f-f7d66402f995")
                        .type(sameAs).ensureTerm(pih, "9718").build())
                .mapping(new ConceptMapBuilder("414cf5b2-4de1-4c00-ad0f-398aa5dcb84b")
                        .type(sameAs).ensureTerm(pih, "NURSE").build())
                .mapping(new ConceptMapBuilder("aad6252d-b190-4a03-8c84-7402a40fc63d")
                        .type(sameAs).ensureTerm(ciel, "1577").build())
                .mapping(new ConceptMapBuilder("136285ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(sameAs).ensureTerm(snomedCt, "106292003").build())
                .mapping(new ConceptMapBuilder("256d1c2a-4556-4e19-8954-995b841e694c")
                        .type(sameAs).ensureTerm(ampath, "6280").build())
                .build());

        install(new ConceptBuilder(Concepts.DOCTOR)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("107418BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "Doctor", Locale.ENGLISH, null) // locale-preferred
                .name("1844BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CLINICAL OFFICER/DOCTOR", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("107417BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "Physician", Locale.ENGLISH, null)
                .name("611d795d-6b27-4d26-8c61-af4a78b8388b", "Médecin", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("1435FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "Physician, doctor or clinical officer", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("4d1beffe-760b-4440-9a1b-54dc27200232")
                        .type(sameAs).ensureTerm(pih, "DOCTOR").build())
                .mapping(new ConceptMapBuilder("022890d2-b180-4680-950f-23f3825f9c91")
                        .type(sameAs).ensureTerm(pih, "9719").build())
                .mapping(new ConceptMapBuilder("f086820a-fe21-47e4-9e3c-719f179e46ea")
                        .type(sameAs).ensureTerm(ciel, "1574").build())
                .mapping(new ConceptMapBuilder("136911ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(sameAs).ensureTerm(snomedCt, "309343006").build())
                .mapping(new ConceptMapBuilder("135312ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(sameAs).ensureTerm(ampath, "5082").build())
                .mapping(new ConceptMapBuilder("135655ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(sameAs).ensureTerm(ampath, "5506").build())
                .build());

        install(new ConceptBuilder(Concepts.COMMUNITY_HEALTH_WORKER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("0b785ea4-15f5-102d-96e4-000c29c2a5d7", "VILLAGE HEALTH WORKER", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("1819BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "COMMUNITY HEALTH CARE WORKER", Locale.ENGLISH, null)
                .name("126198BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CCHA (Community and Clinical Health Assistant)", Locale.ENGLISH, null)
                .name("99967BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "VHW (Village Health Worker)", Locale.ENGLISH, null)
                .name("89434BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CHEW (Community Health Extension Worker)", Locale.ENGLISH, null)
                .name("107416BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CHO (Community Health Officer)", Locale.ENGLISH, null)
                .name("89567BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CHW (Community Health Worker)", Locale.ENGLISH, null)
                .name("107415BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "CHN (Community Health Nurse)", Locale.ENGLISH, null)
                .name("f71fff28-d5db-102d-ad2a-000c29c2a5d7", "ACCOMPAGNATEUR", Locale.FRENCH, null) // locale-preferred
                .name("1820BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", "OFFICIER DE SANTÉ DU VILLAGE", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED)
                .mapping(new ConceptMapBuilder("b25f6544-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "3645").build())
                .mapping(new ConceptMapBuilder("75a0ac8c-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "VILLAGE HEALTH WORKER").build())
                .mapping(new ConceptMapBuilder("3b9816c5-9bd3-441c-a453-5912baf4cfcc")
                        .type(sameAs).ensureTerm(ciel, "1555").build())
                .mapping(new ConceptMapBuilder("137476ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(narrowerThan).ensureTerm(snomedNp, "223366009").build())
                .mapping(new ConceptMapBuilder("141538ABBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
                        .type(sameAs).ensureTerm(snomedMvp, "15551000105005").build())
                .mapping(new ConceptMapBuilder("4c10c0b5-ca8e-4b5f-87a4-3142a269929e")
                        .type(sameAs).ensureTerm(ampath, "1862").build())
                .build());

        install(new ConceptBuilder(Concepts.HOME)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("9880d702-6a5a-11e2-b6f9-aa00f871a3e1", "Home", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("44c1416d-4de3-4cb6-8ff2-af7b5cba366a", "Domicile", Locale.FRENCH, null) // locale-preferred
                .name("f358b82d-631b-49b4-be8e-577d345de149", "Sortie par la maison", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // TODO sketchy translation
                .name("cd429b94-7bb0-4edd-a746-f83f682729ee", "Lakay", locale_HAITI, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .mapping(new ConceptMapBuilder("988417fa-6a5a-11e2-b6f9-aa00f871a3e1")
                        .type(sameAs).ensureTerm(pih, "Home").build())
                .mapping(new ConceptMapBuilder("98843e1a-6a5a-11e2-b6f9-aa00f871a3e1")
                        .type(sameAs).ensureTerm(pih, "7889").build())
                .build());

        install(new ConceptBuilder(Concepts.HOSPITAL)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e215a0a-26fe-102b-80cb-0017a47871b2", "Hospital", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("dbd54ca7-747c-485e-b27b-91bdc50cf0bf", "Hôpital", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("ecef53c0-07fe-102c-b5fa-0017a47871b2", "hospital", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("75826862-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "HOSPITAL").build())
                .mapping(new ConceptMapBuilder("b21fb656-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2070").build())
                .build());

        install(new ConceptBuilder(Concepts.OUTSIDE_OF_INSTITUTION)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("f3bbedb4-91b0-46de-a166-456a6502acda", "Outside of institution", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("d8311920-93a7-4ddf-aa4c-8211451f5d87", "Not in the hospital", Locale.ENGLISH, null)
                .name("da62bffc-ae71-4d3d-817a-05c08f5f119b", "Extra institutionnel", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("0b7bd483-895b-42c6-8b1b-e282a9329ba0", "Not within the hospital, health center, or institution", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("3e83d428-773c-4285-abf3-d52979752048")
                        .type(sameAs).ensureTerm(pih, "Outside of institution").build())
                .mapping(new ConceptMapBuilder("3001f390-94ca-49ba-88d3-3e4101fd29eb")
                        .type(sameAs).ensureTerm(pih, "9670").build())
                .build());

        install(new ConceptBuilder(Concepts.FAMILY_MEMBER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("0b95af4a-15f5-102d-96e4-000c29c2a5d7", "Family member", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("0b95b044-15f5-102d-96e4-000c29c2a5d7", "FAMILY REPRESENTATIVE", Locale.ENGLISH, null)
                .name("0b95b134-15f5-102d-96e4-000c29c2a5d7", "PERSON RELATED TO PATIENT", Locale.ENGLISH, null)
                .name("0753fb31-7dcc-4d79-ae5e-129ee80cb071", "Membre de la famille", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("69566475-e2d7-4c93-8756-2da07ca672a4", "Manm nan fanmi an", locale_HAITI, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("229dde7e-60c8-4bad-a80f-4cd77fda4bc9", "A member of the family or someone who can represent the family", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("75af7b7c-4943-102e-96e9-000c29c2a5d7")
                    .type(sameAs).ensureTerm(pih, "FAMILY MEMBER").build())
                .mapping(new ConceptMapBuilder("b2af2854-4864-102e-96e9-000c29c2a5d7")
                    .type(sameAs).ensureTerm(pih, "6441").build())
                .mapping(new ConceptMapBuilder("1e90497e-d591-11e4-9dcf-b36e1005e77b")
                    .type(sameAs).ensureTerm(snomedCt, "303071001").build())
                .build());

        install(new ConceptBuilder(Concepts.POLICE)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("8281322d-5616-4cc4-8439-092a5388105d", "Police", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("993d6ce0-699a-4f16-8218-099b2effe4a9", "Police", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("54bc35fb-adaf-4d03-b471-fe9d286b8016", "A police force is a constituted body of persons empowered by the state to enforce the law, protect property, and limit civil disorder.", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("e932f7a2-87d1-4caa-beda-5b66725a172b")
                        .type(sameAs).ensureTerm(pih, "Police").build())
                .mapping(new ConceptMapBuilder("9d91a9bd-90e9-411f-a996-0b007d96024f")
                        .type(sameAs).ensureTerm(pih, "9674").build())
                .build());

        install(new ConceptBuilder(Concepts.SURGERY)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("0b928a22-15f5-102d-96e4-000c29c2a5d7", "Surgery", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .name("0b940cd0-15f5-102d-96e4-000c29c2a5d7", "Chirurgie", Locale.FRENCH, ConceptNameType.FULLY_SPECIFIED) // locale-preferred
                .description("ebff68ec-d039-4bc1-83da-2d99d1924972", "An act of performing surgery may be called a surgical procedure, operation, or simply surgery. In this context, the verb operate means performing surgery.", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b2ae45e2-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "6298").build())
                .mapping(new ConceptMapBuilder("992f5fec-50ab-4db2-a9db-a7935ebe8289")
                        .type(sameAs).ensureTerm(pih, "SURGERY").build())
                .build());

/* FATHER, MOTHER, OTHER RELATIVE, SIBLING, PARTNER OR SPOUSE, GUARDIAN RELATIONSHIP TO CHILD, BROTHER, SISTER */
        install(new ConceptBuilder(Concepts.FATHER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e2259b4-26fe-102b-80cb-0017a47871b2", "FATHER", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f672d7ee-d5db-102d-ad2a-000c29c2a5d7", "PÈRE", Locale.FRENCH, null) // locale-preferred
                .description("ecf0be2c-07fe-102c-b5fa-0017a47871b2", "A father to another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b220bc86-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2174").build())
                .mapping(new ConceptMapBuilder("7587049e-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "FATHER").build())
                .mapping(new ConceptMapBuilder("dfcdf95e-d593-11e4-9dcf-b36e1005e77b")
                        .type(sameAs).ensureTerm(ciel, "971").build())
                .build());

        install(new ConceptBuilder(Concepts.MOTHER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e225b1c-26fe-102b-80cb-0017a47871b2", "MOTHER", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f673058e-d5db-102d-ad2a-000c29c2a5d7", "MÈRE", Locale.FRENCH, null) // locale-preferred
                .description("ecf0bf80-07fe-102c-b5fa-0017a47871b2", "A mother of another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("75870606-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "MOTHER").build())
                .mapping(new ConceptMapBuilder("b220be0c-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2175").build())
                .mapping(new ConceptMapBuilder("e1d4e225-6760-46e7-8579-7390d0ec9bea")
                        .type(sameAs).ensureTerm(ciel, "970").build())
                .build());

        install(new ConceptBuilder(Concepts.OTHER_RELATIVE)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e2265d0-26fe-102b-80cb-0017a47871b2", "OTHER RELATIVE", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f6737244-d5db-102d-ad2a-000c29c2a5d7", "AUTRE PARENT", Locale.FRENCH, null) // locale-preferred
                .description("ecf0ce30-07fe-102c-b5fa-0017a47871b2", "A relative (non-coded) to another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b220c3d4-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2179").build())
                .mapping(new ConceptMapBuilder("75870bba-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "OTHER RELATIVE").build())
                .mapping(new ConceptMapBuilder("4c7d9bcf-0691-4f85-8dc6-9f936dbde00d")
                        .type(sameAs).ensureTerm(ciel, "5620").build())
                .build());

        install(new ConceptBuilder(Concepts.SIBLING)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e225f36-26fe-102b-80cb-0017a47871b2", "SIBLING", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f67356b0-d5db-102d-ad2a-000c29c2a5d7", "SOEUR/FRÈRE", Locale.FRENCH, null) // locale-preferred
                .description("ecf0cc5a-07fe-102c-b5fa-0017a47871b2", "A sibling to another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b220c262-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2178").build())
                .mapping(new ConceptMapBuilder("75870a48-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "SIBLING").build())
                .mapping(new ConceptMapBuilder("676d75d2-5930-4b35-aca1-34d8bfe22314")
                        .type(sameAs).ensureTerm(ciel, "972").build())
                .build());

        install(new ConceptBuilder(Concepts.PARTNER_OR_SPOUSE)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e405a36-26fe-102b-80cb-0017a47871b2", "PARTNER OR SPOUSE", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f76e3896-d5db-102d-ad2a-000c29c2a5d7", "PARTENAIRE OU ÉPOUX", Locale.FRENCH, null) // locale-preferred
                .description("ed191d5e-07fe-102c-b5fa-0017a47871b2", "General descriptive answer: a patient's partner or spouse.", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("75aa8f18-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "PARTNER OR SPOUSE").build())
                .mapping(new ConceptMapBuilder("b299ae3e-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "5617").build())
                .mapping(new ConceptMapBuilder("c4b3136a-2eb6-4536-865b-4842246aa015")
                        .type(sameAs).ensureTerm(ciel, "5617").build())
                .build());

        // This concept incorrectly had French names/description for MOTHER CAUSE OF DEATH
        // (This concept is also both a question and an answer.)
        install(new ConceptBuilder(Concepts.GUARDIAN)
                .datatype(text)
                .conceptClass(question)
                .name("3e1ef350-26fe-102b-80cb-0017a47871b2", "GUARDIAN RELATIONSHIP TO CHILD", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("93b6c704-07d4-102c-b5fa-0017a47871b2", "GUARDIAN RELATION", Locale.ENGLISH, ConceptNameType.SHORT)
                .name("f6461a42-d5db-102d-ad2a-000c29c2a5d7", "RELATION DU TUTEUR À L'ENFANT", Locale.FRENCH, null) // locale-preferred
                .description("eceddad6-07fe-102c-b5fa-0017a47871b2", "IF GUARDIAN IS NOT THE CHILD'S PARENTS, WHAT IS HIS/HER RELATION TO THE CHILD?", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("757852a0-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "GUARDIAN RELATIONSHIP TO CHILD").build())
                .mapping(new ConceptMapBuilder("b21637a2-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "1826").build())
                .mapping(new ConceptMapBuilder("9d730eed-dae6-4800-9c0c-13cc7fe49bf2")
                        .type(sameAs).ensureTerm(ciel, "160639").build())
                .build());

        install(new ConceptBuilder(Concepts.BROTHER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e225c7a-26fe-102b-80cb-0017a47871b2", "BROTHER", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f6731f88-d5db-102d-ad2a-000c29c2a5d7", "FRÈRE", Locale.FRENCH, null) // locale-preferred
                .description("ecf0c0e8-07fe-102c-b5fa-0017a47871b2", "A brother to another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b220bf7e-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2176").build())
                .mapping(new ConceptMapBuilder("7587076e-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "BROTHER").build())
                .mapping(new ConceptMapBuilder("457a7d24-c13b-4ad9-af3f-b58da4153dfd")
                        .type(sameAs).ensureTerm(ciel, "160729").build())
                .build());

        install(new ConceptBuilder(Concepts.SISTER)
                .datatype(notApplicable)
                .conceptClass(misc)
                .name("3e225dd8-26fe-102b-80cb-0017a47871b2", "SISTER", Locale.ENGLISH, ConceptNameType.FULLY_SPECIFIED)
                .name("f67339fa-d5db-102d-ad2a-000c29c2a5d7", "SOEUR", Locale.FRENCH, null) // locale-preferred
                .description("ecf0ca5c-07fe-102c-b5fa-0017a47871b2", "Sister to another person", Locale.ENGLISH)
                .mapping(new ConceptMapBuilder("b220c0f0-4864-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "2177").build())
                .mapping(new ConceptMapBuilder("758708e0-4943-102e-96e9-000c29c2a5d7")
                        .type(sameAs).ensureTerm(pih, "SISTER").build())
                .mapping(new ConceptMapBuilder("3ddec89b-4770-4777-9d9b-7c15c10322a3")
                        .type(sameAs).ensureTerm(ciel, "160730").build())
                .build());
    }

}
