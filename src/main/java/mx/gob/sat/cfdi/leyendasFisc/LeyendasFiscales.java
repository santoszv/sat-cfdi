//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.leyendasFisc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="Leyenda" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="disposicionFiscal">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <minLength value="1"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="norma">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <minLength value="1"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="textoLeyenda" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "leyenda"
})
@XmlRootElement(name = "LeyendasFiscales")
public class LeyendasFiscales
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Leyenda", required = true)
    protected List<LeyendasFiscales.Leyenda> leyenda;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the leyenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the leyenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeyenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeyendasFiscales.Leyenda }
     * 
     * 
     * @return
     *     The value of the leyenda property.
     */
    public List<LeyendasFiscales.Leyenda> getLeyenda() {
        if (leyenda == null) {
            leyenda = new ArrayList<>();
        }
        return this.leyenda;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="disposicionFiscal">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <minLength value="1"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="norma">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <minLength value="1"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="textoLeyenda" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
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
    public static class Leyenda
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlAttribute(name = "disposicionFiscal")
        protected String disposicionFiscal;
        @XmlAttribute(name = "norma")
        protected String norma;
        @XmlAttribute(name = "textoLeyenda", required = true)
        protected String textoLeyenda;

        /**
         * Gets the value of the disposicionFiscal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisposicionFiscal() {
            return disposicionFiscal;
        }

        /**
         * Sets the value of the disposicionFiscal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisposicionFiscal(String value) {
            this.disposicionFiscal = value;
        }

        /**
         * Gets the value of the norma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNorma() {
            return norma;
        }

        /**
         * Sets the value of the norma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNorma(String value) {
            this.norma = value;
        }

        /**
         * Gets the value of the textoLeyenda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextoLeyenda() {
            return textoLeyenda;
        }

        /**
         * Sets the value of the textoLeyenda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextoLeyenda(String value) {
            this.textoLeyenda = value;
        }

    }

}