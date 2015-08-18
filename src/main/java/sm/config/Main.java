package sm.config;

import org.apache.commons.configuration.FileConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

public class Main {

    public static final String PROP_PATH = "resources/sampleconfig.properties";
    public static final int REFRESH_INTERVAL = 0;

    public static void main(String[] args) throws Exception {
        FileConfiguration config = new PropertiesConfiguration(PROP_PATH);
        //Create new FileChangedReloadingStrategy to reload the properties file based on the given time interval
        FileChangedReloadingStrategy fileChangedReloadingStrategy = new FileChangedReloadingStrategy();
        fileChangedReloadingStrategy.setRefreshDelay(REFRESH_INTERVAL);
        config.setReloadingStrategy(fileChangedReloadingStrategy);

        config.save(System.out);
        //while (true) {
          //  System.out.println(config.getString("eureka.name"));
        //}
    }

}
