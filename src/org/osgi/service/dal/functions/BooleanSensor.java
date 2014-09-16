package org.osgi.service.dal.functions;

import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.BooleanData;

public interface BooleanSensor extends Function{

	static final String PROPERTY_DATA = "data";	
	
	BooleanData getData() throws UnsupportedOperationException, IllegalStateException, org.osgi.service.dal.DeviceException;
}
