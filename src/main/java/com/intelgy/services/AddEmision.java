
package com.intelgy.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addEmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addEmision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensajefuse"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEmision", propOrder = {
    "mensajefuse"
})
public class AddEmision {

    @XmlElement(required = true)
    protected String mensajefuse;

    /**
     * Obtiene el valor de la propiedad mensajefuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajefuse() {
        return mensajefuse;
    }

    /**
     * Define el valor de la propiedad mensajefuse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajefuse(String value) {
        this.mensajefuse = value;
    }

}
