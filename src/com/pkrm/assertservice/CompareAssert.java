package com.pkrm.assertservice;

import java.util.ArrayList;
import java.util.Set;

import com.pkrm.baseexception.PKRMException;
import com.pkrm.prop.reader.PropReader;

/*
 * 
 */
public class CompareAssert {

	public static Boolean isExistErrDesc(String aErrDesc) {

		Boolean isErrDescExist = false;

		ArrayList<String> values = PropReader.getAllProperties();

		for (String prop : values) {
			if (aErrDesc != null) {
				if (prop.contains(aErrDesc)) {
					isErrDescExist = true;
				}

			}

		}

		return isErrDescExist;
	}

	public static Boolean isExistErrCode(String aErrCode) {

		Boolean isErrCodeExist = false;

		Set<Object> allKeys = PropReader.getAllKeys();

		for (Object k : allKeys) {
			String key = (String) k;
			if (aErrCode != null) {
				if (key.contains(aErrCode)) {
					isErrCodeExist = true;
				}
			}
		}
		return isErrCodeExist;

	}

	public static boolean isValidAssert(PKRMException pkrmExceptObject) {

		Boolean isValidAssert = false;

		Set<Object> allKeys = PropReader.getAllKeys();

		for (Object k : allKeys) {
			String key = (String) k;
			if (pkrmExceptObject != null) {

				if (pkrmExceptObject.getApiErrorCode() != null
						&& pkrmExceptObject.getApiErrorName() != null
						&& pkrmExceptObject.getApiErrorDesc() != null
						&& pkrmExceptObject.getApiHttpResCode() != null) {

					if (key.contains(pkrmExceptObject.getApiErrorCode())
							&& key.contains(pkrmExceptObject.getApiErrorName())
							&& key.contains(pkrmExceptObject
									.getApiHttpResCode())) {
						String propery = PropReader.getProperty(key);
						if (propery != null
								&& pkrmExceptObject.getApiErrorDesc().equalsIgnoreCase(propery)) {
							isValidAssert = true;
						}
					}
				}
			}

		}

		return isValidAssert;
	}

}
