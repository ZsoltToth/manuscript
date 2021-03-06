//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.15 at 12:08:20 PM CEST 
//


package manuscript.module.user.management.bean;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for password complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="password"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Password" type="{http://manuscript/module/user/management/bean}passwordType"/&gt;
 *         &lt;element name="PasswordAgain" type="{http://manuscript/module/user/management/bean}passwordType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "password", propOrder = {
    "password",
    "passwordAgain"
})
public class Password {

    @XmlElement(name = "Password", required = true)
    @NotNull
    protected String password;
    @XmlElement(name = "PasswordAgain", required = true)
    @NotNull
    protected String passwordAgain;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordAgain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAgain() {
        return passwordAgain;
    }

    /**
     * Sets the value of the passwordAgain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAgain(String value) {
        this.passwordAgain = value;
    }

}
