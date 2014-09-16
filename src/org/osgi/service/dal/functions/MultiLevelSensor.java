package org.osgi.service.dal.functions;

import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.LevelData;

public interface MultiLevelSensor extends Function{
	static final String PROPERTY_DATA = "data";
	
	LevelData getData()
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException;
}
