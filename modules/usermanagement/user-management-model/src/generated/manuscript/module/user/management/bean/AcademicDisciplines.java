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
 * <p>Java class for academicDisciplines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="academicDisciplines"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcademicDisciplinesId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcademicDisciplinesName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "academicDisciplines", propOrder = {
    "academicDisciplinesId",
    "academicDisciplinesName"
})
public class AcademicDisciplines {

    @XmlElement(name = "AcademicDisciplinesId", required = true)
    @NotNull
    protected String academicDisciplinesId;
    @XmlElement(name = "AcademicDisciplinesName", required = true)
    @NotNull
    protected String academicDisciplinesName;

    /**
     * Gets the value of the academicDisciplinesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDisciplinesId() {
        return academicDisciplinesId;
    }

    /**
     * Sets the value of the academicDisciplinesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDisciplinesId(String value) {
        this.academicDisciplinesId = value;
    }

    /**
     * Gets the value of the academicDisciplinesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDisciplinesName() {
        return academicDisciplinesName;
    }

    /**
     * Sets the value of the academicDisciplinesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDisciplinesName(String value) {
        this.academicDisciplinesName = value;
    }

}
