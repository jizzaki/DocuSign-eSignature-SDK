/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
package net.docusign.api_3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateReferenceRoleAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateReferenceRoleAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateReferenceRoleAssignment", propOrder = {
    "roleName",
    "recipientID"
})
public class TemplateReferenceRoleAssignment {

    @XmlElement(name = "RoleName")
    protected String roleName;
    @XmlElement(name = "RecipientID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recipientID;

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the recipientID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientID() {
        return recipientID;
    }

    /**
     * Sets the value of the recipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientID(BigInteger value) {
        this.recipientID = value;
    }

}
