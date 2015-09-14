package org.ditang.relaxng.defaults;

/**
 * Constants for RelaxNG default value component.
 */
public interface DefaultsConstants {

    /**
     * <p>The system property used to determine whether or not the parser will
     * validate the source document against the schema.</p>
     *
     * <p>Values "true" and "yes" indicate validation, anything else does not.</p>
     */
    String VALIDATION_PROPERTY = "dita-ng.validation";

    String PROPERTIES_FILE = "dita-ng.properties";

    String PROPERTIES_FILE_VALIDATION_PROPERTY = "validation";

}