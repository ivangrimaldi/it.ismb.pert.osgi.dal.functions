package org.osgi.service.dal.functions;

import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.LevelData;

public interface Meter extends Function{
	static final String FLOW_IN = "in";
	static final String FLOW_OUT = "out";
	static final String SERVICE_FLOW = "dal.meter.flow";
	static final String PROPERTY_CURRENT = "current";
	static final String PROPERTY_TOTAL = "total";
	static final String OPERATION_RESET_TOTAL = "resetTotal";
	
	
	LevelData getCurrent()
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException;
	
	LevelData getTotal()
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException;

	void resetTotal()
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException;


	
}
