package org.osgi.service.dal.functions.data;

import java.math.BigDecimal;
import java.util.Map;

import org.osgi.service.dal.FunctionData;

public class LevelData extends FunctionData{

	public final static String FIELD_LEVEL="level";
	public final static String FIELD_UNIT="unit";
	
	private final BigDecimal level;
	private final String unit;
	
	public LevelData(Map fields) {
		super(fields);
		
		if(fields.containsKey(FIELD_LEVEL))
		{
			level=(BigDecimal)(fields.get(FIELD_LEVEL));
		}else{
			throw new IllegalArgumentException();
		}
		
		if(fields.containsKey(FIELD_UNIT))
		{
			unit=(String)(fields.get(FIELD_UNIT));
		}else{
			unit="";
		}
		
		
	}

	public LevelData(long timestamp, Map metadata, String unit, BigDecimal level)
	{
		super(timestamp,metadata);
		this.level=level;
		this.unit=unit;
	}

	@Override
	public int compareTo(Object o) {
		return this.level.compareTo(((LevelData)o).level);
	}

	public String getUnit() {
		return unit;
	}
	
	public BigDecimal getLevel()
	{
		return level;
	}

}
