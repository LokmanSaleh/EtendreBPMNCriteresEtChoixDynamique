/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.Criterias;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Criterias</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriteriasTest extends TestCase {

	/**
	 * The fixture for this Criterias test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Criterias fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CriteriasTest.class);
	}

	/**
	 * Constructs a new Criterias test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriasTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Criterias test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Criterias fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Criterias test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Criterias getFixture() {
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
		setFixture(MyModelFactory.eINSTANCE.createCriterias());
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

} //CriteriasTest
