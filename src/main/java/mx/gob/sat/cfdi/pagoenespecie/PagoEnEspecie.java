//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.pagoenespecie;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       <attribute name="CvePIC" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="25"/>
 *             <pattern value="[A-ZÑ&]{3}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z0-9]?[A-Z0-9]?[0-9A-Z]-(18|19|20)\d\d(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])-[0-9]{3}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FolioSolDon" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="11"/>
 *             <pattern value="PE-[0-9]{2}-[0-9]{5}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PzaArtNombre" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PzaArtTecn" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PzaArtAProd" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <pattern value="[0-9]{4}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PzaArtDim" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
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
@XmlRootElement(name = "PagoEnEspecie")
public class PagoEnEspecie
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "CvePIC", required = true)
    protected String cvePIC;
    @XmlAttribute(name = "FolioSolDon", required = true)
    protected String folioSolDon;
    @XmlAttribute(name = "PzaArtNombre", required = true)
    protected String pzaArtNombre;
    @XmlAttribute(name = "PzaArtTecn", required = true)
    protected String pzaArtTecn;
    @XmlAttribute(name = "PzaArtAProd", required = true)
    protected String pzaArtAProd;
    @XmlAttribute(name = "PzaArtDim", required = true)
    protected String pzaArtDim;

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
            return "1.0";
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
     * Gets the value of the cvePIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvePIC() {
        return cvePIC;
    }

    /**
     * Sets the value of the cvePIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvePIC(String value) {
        this.cvePIC = value;
    }

    /**
     * Gets the value of the folioSolDon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioSolDon() {
        return folioSolDon;
    }

    /**
     * Sets the value of the folioSolDon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioSolDon(String value) {
        this.folioSolDon = value;
    }

    /**
     * Gets the value of the pzaArtNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzaArtNombre() {
        return pzaArtNombre;
    }

    /**
     * Sets the value of the pzaArtNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzaArtNombre(String value) {
        this.pzaArtNombre = value;
    }

    /**
     * Gets the value of the pzaArtTecn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzaArtTecn() {
        return pzaArtTecn;
    }

    /**
     * Sets the value of the pzaArtTecn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzaArtTecn(String value) {
        this.pzaArtTecn = value;
    }

    /**
     * Gets the value of the pzaArtAProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzaArtAProd() {
        return pzaArtAProd;
    }

    /**
     * Sets the value of the pzaArtAProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzaArtAProd(String value) {
        this.pzaArtAProd = value;
    }

    /**
     * Gets the value of the pzaArtDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzaArtDim() {
        return pzaArtDim;
    }

    /**
     * Sets the value of the pzaArtDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzaArtDim(String value) {
        this.pzaArtDim = value;
    }

}