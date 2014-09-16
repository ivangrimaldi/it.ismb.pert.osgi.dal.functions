package org.osgi.service.dal.functions;

import java.math.BigDecimal;

import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.LevelData;

public interface MultiLevelControl extends Function{
	static final String PROPERTY_DATA = "data";
	
	LevelData getData()
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException;

	void setData(BigDecimal level)
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException,
			IllegalArgumentException;
	
	void setData(BigDecimal level,
			String unit)
			throws UnsupportedOperationException,
			IllegalStateException,
			org.osgi.service.dal.DeviceException,
			IllegalArgumentException;



}
