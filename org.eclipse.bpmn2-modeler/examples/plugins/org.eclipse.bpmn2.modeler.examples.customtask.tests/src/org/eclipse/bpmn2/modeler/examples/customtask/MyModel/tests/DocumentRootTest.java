/**
 */
package org.eclipse.bpmn2.modeler.examples.customtask.MyModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.DocumentRoot;
import org.eclipse.bpmn2.modeler.examples.customtask.MyModel.MyModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot getFixture() {
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
		setFixture(MyModelFactory.eINSTANCE.createDocumentRoot());
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

} //DocumentRootTest
