package org.osgi.service.dal.functions;

import org.osgi.service.dal.functions.data.BooleanData;

public interface BooleanControl extends org.osgi.service.dal.Function{

	public static final String OPERATION_REVERSE = "reverse";
	public static final String OPERATION_SET_TRUE = "setTrue";
	public static final String OPERATION_SET_FALSE = "setFalse";
	public static final String PROPERTY_DATA = "data";	
	
	BooleanData getData() throws UnsupportedOperationException, IllegalStateException, org.osgi.service.dal.DeviceException;
	
	void setData(boolean data) throws UnsupportedOperationException, IllegalStateException,	
										org.osgi.service.dal.DeviceException, IllegalArgumentException;
	
	void reverse() throws UnsupportedOperationException, IllegalStateException, org.osgi.service.dal.DeviceException;
	
	void setTrue() throws UnsupportedOperationException, IllegalStateException,	org.osgi.service.dal.DeviceException;
	
	void setFalse()	throws UnsupportedOperationException, IllegalStateException, org.osgi.service.dal.DeviceException;
}
