package org.framework.Framework;

import org.framework.Base;

public class Child {

	public static void main(String[] args) {

		Base b = new Base();
		
		b.getBrowser("https://www.facebook.com");
		Locators l = new Locators();
		b.passingValues(l.getTxtuname(), "welcome");
		b.passingValues(l.getTxtpwd(), "java");
		b.clickMethod(l.getBtnlogin());
	}

}
