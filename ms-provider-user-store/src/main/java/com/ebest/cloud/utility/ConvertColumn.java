package com.ebest.cloud.utility;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

/**
 * This class is used to convert the parameters to column name
 * @author ebest
 *
 */
public class ConvertColumn {
	
	//difine map object  
	private static HashMap<String, String> fieldToColumn = new HashMap<String,String>();
	
	//init map
	static {
		fieldToColumn.put(ConstantClassField.STORECODE, ConstantClassField.STORECODE_COLUMN);
		fieldToColumn.put(ConstantClassField.STORENAME, ConstantClassField.STORENAME_COLUMN);
		fieldToColumn.put(ConstantClassField.STORETYPECODE, ConstantClassField.STORETYPECODE_COLUMN);
		fieldToColumn.put(ConstantClassField.CHANNELCODE, ConstantClassField.CHANNELCODE_COLUMN);
		fieldToColumn.put(ConstantClassField.BANNERCODE, ConstantClassField.BANNERCODE_COLUMN);
		fieldToColumn.put(ConstantClassField.MARKETCODE, ConstantClassField.MARKETCODE_COLUMN);
		fieldToColumn.put(ConstantClassField.STOREOWNERCODE, ConstantClassField.STOREOWNERCODE_COLUMN);
		fieldToColumn.put(ConstantClassField.REGIONCODE, ConstantClassField.REGIONCODE_COLUMN);
	}
	
	/**
	 * get the column name by key
	 * @param key
	 * @return String
	 */
	public static String fromParamter(String key) {
		
		// trim the key
		key = StringUtils.trim(key);
		
		if(fieldToColumn.containsKey(key)) {
			// return value from map
			return fieldToColumn.get(key);
		}else {
			// return default value from map
			return fieldToColumn.get(ConstantClassField.STORECODE);
		}
	};
}
