
//
package gov.nih.nlm.nls.utils;

import java.util.Properties;

/**
 * <ol>
 * <li> Place default configuration in  key --> value map.
 * <li> Read options and place options in key --> value map.
 * <li> If configfile option present in map use it in next step other use default
 * <li> Load properties file and apply if present.
 * <li> apply any system properties if present
 * <li> apply any options supplied by user
 * </ol>
 */

public class Configuration {


  public static Properties mergeConfiguration(Properties defaultConfiguration,
					      Properties localConfiguration,
					      Properties optionsConfiguration) {
    Properties configuration = new Properties();
    configuration.putAll(defaultConfiguration);
    configuration.putAll(localConfiguration);
    configuration.putAll(optionsConfiguration);
    return configuration;
  }
}
