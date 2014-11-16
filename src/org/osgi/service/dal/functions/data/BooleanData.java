package org.osgi.service.dal.functions.data;

import java.util.Map;


public class BooleanData extends org.osgi.service.dal.FunctionData{

	static final String FIELD_VALUE = "value";
	public final boolean value;
	

	public BooleanData (long timestamp, Map metadata, boolean value) {
		super(timestamp, metadata);
		this.value = value;
	}
	
	public BooleanData(Map fields) {
		super(fields);
		
		if(fields.containsKey(FIELD_VALUE)) {
			value = (Boolean)fields.get(FIELD_VALUE);
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	
	public boolean getValue(){
		return this.value;
	}

	public int compareTo(Object o) {
		//FIXME: compare also timestamp/metadata
		if(this.value==((BooleanData)o).getValue())
			return 0;
		else
			return 1;
	}
	
}
