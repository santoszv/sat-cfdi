//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.implocal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *       <sequence maxOccurs="unbounded">
 *         <element name="RetencionesLocales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TasadeRetencion" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Importe" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TrasladosLocales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TasadeTraslado" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Importe" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" />
 *       <attribute name="TotaldeRetenciones" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TotaldeTraslados" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
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
@XmlType(name = "", propOrder = {
    "retencionesLocalesAndTrasladosLocales"
})
@XmlRootElement(name = "ImpuestosLocales")
public class ImpuestosLocales
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "RetencionesLocales", type = ImpuestosLocales.RetencionesLocales.class),
        @XmlElement(name = "TrasladosLocales", type = ImpuestosLocales.TrasladosLocales.class)
    })
    protected List<Serializable> retencionesLocalesAndTrasladosLocales;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TotaldeRetenciones", required = true)
    protected BigDecimal totaldeRetenciones;
    @XmlAttribute(name = "TotaldeTraslados", required = true)
    protected BigDecimal totaldeTraslados;

    /**
     * Gets the value of the retencionesLocalesAndTrasladosLocales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the retencionesLocalesAndTrasladosLocales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionesLocalesAndTrasladosLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestosLocales.RetencionesLocales }
     * {@link ImpuestosLocales.TrasladosLocales }
     * 
     * 
     * @return
     *     The value of the retencionesLocalesAndTrasladosLocales property.
     */
    public List<Serializable> getRetencionesLocalesAndTrasladosLocales() {
        if (retencionesLocalesAndTrasladosLocales == null) {
            retencionesLocalesAndTrasladosLocales = new ArrayList<>();
        }
        return this.retencionesLocalesAndTrasladosLocales;
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
     * Gets the value of the totaldeRetenciones property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeRetenciones() {
        return totaldeRetenciones;
    }

    /**
     * Sets the value of the totaldeRetenciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaldeRetenciones(BigDecimal value) {
        this.totaldeRetenciones = value;
    }

    /**
     * Gets the value of the totaldeTraslados property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeTraslados() {
        return totaldeTraslados;
    }

    /**
     * Sets the value of the totaldeTraslados property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaldeTraslados(BigDecimal value) {
        this.totaldeTraslados = value;
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
     *       <attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TasadeRetencion" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Importe" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
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
    public static class RetencionesLocales implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlAttribute(name = "ImpLocRetenido", required = true)
        protected String impLocRetenido;
        @XmlAttribute(name = "TasadeRetencion", required = true)
        protected BigDecimal tasadeRetencion;
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Gets the value of the impLocRetenido property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocRetenido() {
            return impLocRetenido;
        }

        /**
         * Sets the value of the impLocRetenido property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpLocRetenido(String value) {
            this.impLocRetenido = value;
        }

        /**
         * Gets the value of the tasadeRetencion property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeRetencion() {
            return tasadeRetencion;
        }

        /**
         * Sets the value of the tasadeRetencion property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasadeRetencion(BigDecimal value) {
            this.tasadeRetencion = value;
        }

        /**
         * Gets the value of the importe property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Sets the value of the importe property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

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
     *       <attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TasadeTraslado" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Importe" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
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
    public static class TrasladosLocales implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlAttribute(name = "ImpLocTrasladado", required = true)
        protected String impLocTrasladado;
        @XmlAttribute(name = "TasadeTraslado", required = true)
        protected BigDecimal tasadeTraslado;
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Gets the value of the impLocTrasladado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocTrasladado() {
            return impLocTrasladado;
        }

        /**
         * Sets the value of the impLocTrasladado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpLocTrasladado(String value) {
            this.impLocTrasladado = value;
        }

        /**
         * Gets the value of the tasadeTraslado property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeTraslado() {
            return tasadeTraslado;
        }

        /**
         * Sets the value of the tasadeTraslado property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasadeTraslado(BigDecimal value) {
            this.tasadeTraslado = value;
        }

        /**
         * Gets the value of the importe property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Sets the value of the importe property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

    }

}
