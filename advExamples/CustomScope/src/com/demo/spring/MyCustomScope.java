package com.demo.spring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyCustomScope implements Scope {
	private Map<String, Object> objectMap = Collections
			.synchronizedMap(new HashMap<String, Object>());

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (!objectMap.containsKey(name)) {
			objectMap.put(name, objectFactory.getObject());

		}
		return objectMap.get(name);
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return "myscope";
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearScope() {
		objectMap.clear();
	}

}
