package com.pkrm.prop.reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

/*
 * @author Srinivasulu
 * 
 *		This PropReader is used to read the property value for given property
 *	 which is provided by the user. 
 *
 */
public class PropReader {

	public static Properties prop = null;

	static {

		InputStream is = null;
		try {
			prop = new Properties();
			is = PropReader.class
					.getResourceAsStream("" +
							"/com/pkrm/resources/ErrorCodesAndDescription.properties");
			prop.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @param property
	 *            String
	 * @return property value String
	 * 
	 *         This Method read the property from the
	 *         ErrorcodesAndDescription.properties file.
	 * 
	 */
	public static String getProperty(String property) {

		String propVal = null;

		if (prop.getProperty(property) != null) {
			propVal = prop.getProperty(property);
		}

		return propVal;

	}

	public static ArrayList<String> getAllProperties() {
		
		ArrayList<String> allValues = new ArrayList<String>();
		Set<Object> allKeys = prop.keySet();
		
		
		for (Object k : allKeys) {
			String key = (String) k;
			String value =PropReader.getProperty(key); 
			if( value != null){
				allValues.add(value);
			}
		}

		return allValues;
	}

	public static Set<Object> getAllKeys() {
		Set<Object> keys = prop.keySet();
		return keys;
	}

}
