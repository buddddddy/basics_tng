package org.buddddddy.basic.patterns.factory;

import com.sun.deploy.util.StringUtils;
import org.junit.Assert;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 23.12.2017
 * @package org.buddddddy.basic.patterns.factory
 */
public class StorageFactory {

    //use getShape method to get object of type shape
    public WrikeStorage getStorage(String storageType){
        Assert.assertFalse(storageType == null || storageType.trim().equals(""));

        if(storageType.equalsIgnoreCase("local")){
            return new LocalStorage();
        } else if(storageType.equalsIgnoreCase("proxy")){
            return new ProxyStorage();
        }

        return null;
    }
}
