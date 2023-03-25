/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.TaskConfig;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskConfigTest extends TestCase {

	/**
	 * The fixture for this Task Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskConfigTest.class);
	}

	/**
	 * Constructs a new Task Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfig getFixture() {
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
		setFixture(MyModelFactory.eINSTANCE.createTaskConfig());
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

} //TaskConfigTest
