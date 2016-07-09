/**
 */
package org.scribble.editor.dsl.scribbleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Recursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.editor.dsl.scribbleDsl.GlobalRecursion#getLabel <em>Label</em>}</li>
 *   <li>{@link org.scribble.editor.dsl.scribbleDsl.GlobalRecursion#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.editor.dsl.scribbleDsl.ScribbleDslPackage#getGlobalRecursion()
 * @model
 * @generated
 */
public interface GlobalRecursion extends GlobalInteraction
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.scribble.editor.dsl.scribbleDsl.ScribbleDslPackage#getGlobalRecursion_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.scribble.editor.dsl.scribbleDsl.GlobalRecursion#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(GlobalProtocolBlock)
   * @see org.scribble.editor.dsl.scribbleDsl.ScribbleDslPackage#getGlobalRecursion_Block()
   * @model containment="true"
   * @generated
   */
  GlobalProtocolBlock getBlock();

  /**
   * Sets the value of the '{@link org.scribble.editor.dsl.scribbleDsl.GlobalRecursion#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(GlobalProtocolBlock value);

} // GlobalRecursion
