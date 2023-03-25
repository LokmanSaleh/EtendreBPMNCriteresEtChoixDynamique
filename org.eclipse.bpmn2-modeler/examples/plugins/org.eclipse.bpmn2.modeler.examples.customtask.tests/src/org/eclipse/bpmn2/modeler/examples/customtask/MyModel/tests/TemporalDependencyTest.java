/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TemporalDependency;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalDependencyTest extends TestCase {

	/**
	 * The fixture for this Temporal Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDependency fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalDependencyTest.class);
	}

	/**
	 * Constructs a new Temporal Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDependencyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Temporal Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TemporalDependency fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Temporal Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDependency getFixture() {
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
		setFixture(MyModelFactory.eINSTANCE.createTemporalDependency());
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

} //TemporalDependencyTest
