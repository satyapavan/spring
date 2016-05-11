package com.demo.spring;

public class Singer implements Performer {

	public void perform() throws PerformerException {

		System.out.println("Singer Sings : la la la....");
		//throw new PerformerException();

	}

}
