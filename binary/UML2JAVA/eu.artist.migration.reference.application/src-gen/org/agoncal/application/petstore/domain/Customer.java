/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::Customer uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 17. Juni 2014 20:36:37 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import java.util.Date;
import org.agoncal.application.petstore.domain.Address;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Customer.
 * 
 * @author 
 */
@Entity
public class Customer {
	/**
	 * Description of the property id.
	 */
	@Id
	public Long id;
	/**
	  * Description of the property login.
	  */
	
	public String login;
	/**
	   * Description of the property password.
	   */
	
	public String password;
	/**
	    * Description of the property firstname.
	    */
	
	public String firstname;
	/**
	     * Description of the property lastname.
	     */
	
	public String lastname;
	/**
	      * Description of the property homeAddress.
	      */
	
	public Address homeAddress;
	/**
	       * Description of the property dateOfBirth.
	       */
	
	public Date dateOfBirth;
	// Start of user code (user defined attributes for Customer)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public Customer() {
	
	}
	
	// Start of user code (user defined methods for Customer)
	
	// End of user code
	/**
	 * Returns id.
	 * @return id 
	 */
	public long getId() {
		return this.id;
	}
	
	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(long newId) {
	    this.id = newId;
	}

	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}
	
	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
	    this.login = newLogin;
	}

	/**
	 * Returns password.
	 * @return password 
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * Sets a value to attribute password. 
	 * @param newPassword 
	 */
	public void setPassword(String newPassword) {
	    this.password = newPassword;
	}

	/**
	 * Returns firstname.
	 * @return firstname 
	 */
	public String getFirstname() {
		return this.firstname;
	}
	
	/**
	 * Sets a value to attribute firstname. 
	 * @param newFirstname 
	 */
	public void setFirstname(String newFirstname) {
	    this.firstname = newFirstname;
	}

	/**
	 * Returns lastname.
	 * @return lastname 
	 */
	public String getLastname() {
		return this.lastname;
	}
	
	/**
	 * Sets a value to attribute lastname. 
	 * @param newLastname 
	 */
	public void setLastname(String newLastname) {
	    this.lastname = newLastname;
	}

	/**
	 * Returns homeAddress.
	 * @return homeAddress 
	 */
	public Address getHomeAddress() {
		return this.homeAddress;
	}
	
	/**
	 * Sets a value to attribute homeAddress. 
	 * @param newHomeAddress 
	 */
	public void setHomeAddress(Address newHomeAddress) {
	    this.homeAddress = newHomeAddress;
	}

	/**
	 * Returns dateOfBirth.
	 * @return dateOfBirth 
	 */
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	/**
	 * Sets a value to attribute dateOfBirth. 
	 * @param newDateOfBirth 
	 */
	public void setDateOfBirth(Date newDateOfBirth) {
	    this.dateOfBirth = newDateOfBirth;
	}




}