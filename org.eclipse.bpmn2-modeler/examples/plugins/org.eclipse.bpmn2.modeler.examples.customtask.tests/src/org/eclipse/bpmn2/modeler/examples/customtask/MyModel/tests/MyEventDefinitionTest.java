/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyEventDefinition;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyEventDefinitionTest extends TestCase {

	/**
	 * The fixture for this My Event Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyEventDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MyEventDefinitionTest.class);
	}

	/**
	 * Constructs a new My Event Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEventDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this My Event Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MyEventDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this My Event Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyEventDefinition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyModelFactory.eINSTANCE.createMyEventDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MyEventDefinitionTest
