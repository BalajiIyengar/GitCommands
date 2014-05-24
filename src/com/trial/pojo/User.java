/**
 * 
 */
package com.trial.pojo;

/**
 * @author balaji i
 *
 */
public class User 
{
	private String username;
	private String password;
	
	
	public User(String username , String password)
	{
		this.username = username;
		this.password = password;
	}

	
	@Override
	public boolean equals(Object other)
	{
		  if (!(other instanceof User)) {
		        return false;
		    }

		  User that = (User) other;

		    // Custom equality check here.
		    return this.username.equals(that.username)
		        && this.password.equals(that.password);
	}
	@Override
	public int hashCode() {
	    int hashCode = 0;

	    hashCode = hashCode * 37 + this.username.hashCode();
	    hashCode = hashCode * 37 + this.password.hashCode();

	    return hashCode;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
