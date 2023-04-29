//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.donat11;

import java.io.Serializable;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.1" />
 *       <attribute name="noAutorizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="fechaAutorizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="leyenda" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Donatarias")
public class Donatarias
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "noAutorizacion", required = true)
    protected String noAutorizacion;
    @XmlAttribute(name = "fechaAutorizacion", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAutorizacion;
    @XmlAttribute(name = "leyenda", required = true)
    protected String leyenda;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the noAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAutorizacion() {
        return noAutorizacion;
    }

    /**
     * Sets the value of the noAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAutorizacion(String value) {
        this.noAutorizacion = value;
    }

    /**
     * Gets the value of the fechaAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    /**
     * Sets the value of the fechaAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAutorizacion(XMLGregorianCalendar value) {
        this.fechaAutorizacion = value;
    }

    /**
     * Gets the value of the leyenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeyenda() {
        return leyenda;
    }

    /**
     * Sets the value of the leyenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeyenda(String value) {
        this.leyenda = value;
    }

}