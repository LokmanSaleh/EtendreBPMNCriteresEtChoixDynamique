/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>MyModel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyModelAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MyModelAllTests("MyModel Tests");
		suite.addTest(MyModelTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyModelAllTests(String name) {
		super(name);
	}

} //MyModelAllTests
