//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.ventavehiculos11;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <choice>
 *         <element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Parte" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="cantidad" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="unidad">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <minLength value="1"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="noIdentificacion">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="descripcion" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="valorUnitario" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" />
 *                 <attribute name="importe" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.1" />
 *       <attribute name="ClaveVehicular" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Niv" use="required">
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
@XmlType(name = "", propOrder = {
    "informacionAduanera",
    "parte"
})
@XmlRootElement(name = "VentaVehiculos")
public class VentaVehiculos
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "InformacionAduanera")
    protected List<TInformacionAduanera> informacionAduanera;
    @XmlElement(name = "Parte")
    protected List<VentaVehiculos.Parte> parte;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "ClaveVehicular", required = true)
    protected String claveVehicular;
    @XmlAttribute(name = "Niv", required = true)
    protected String niv;

    /**
     * Gets the value of the informacionAduanera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the informacionAduanera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionAduanera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInformacionAduanera }
     * 
     * 
     * @return
     *     The value of the informacionAduanera property.
     */
    public List<TInformacionAduanera> getInformacionAduanera() {
        if (informacionAduanera == null) {
            informacionAduanera = new ArrayList<>();
        }
        return this.informacionAduanera;
    }

    /**
     * Gets the value of the parte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the parte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaVehiculos.Parte }
     * 
     * 
     * @return
     *     The value of the parte property.
     */
    public List<VentaVehiculos.Parte> getParte() {
        if (parte == null) {
            parte = new ArrayList<>();
        }
        return this.parte;
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
     * Gets the value of the claveVehicular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveVehicular() {
        return claveVehicular;
    }

    /**
     * Sets the value of the claveVehicular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveVehicular(String value) {
        this.claveVehicular = value;
    }

    /**
     * Gets the value of the niv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiv() {
        return niv;
    }

    /**
     * Sets the value of the niv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiv(String value) {
        this.niv = value;
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
     *       <sequence>
     *         <element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="cantidad" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="unidad">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <minLength value="1"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="noIdentificacion">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="descripcion" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="valorUnitario" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" />
     *       <attribute name="importe" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "informacionAduanera"
    })
    public static class Parte
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlElement(name = "InformacionAduanera")
        protected List<TInformacionAduanera> informacionAduanera;
        @XmlAttribute(name = "cantidad", required = true)
        protected BigDecimal cantidad;
        @XmlAttribute(name = "unidad")
        protected String unidad;
        @XmlAttribute(name = "noIdentificacion")
        protected String noIdentificacion;
        @XmlAttribute(name = "descripcion", required = true)
        protected String descripcion;
        @XmlAttribute(name = "valorUnitario")
        protected BigDecimal valorUnitario;
        @XmlAttribute(name = "importe")
        protected BigDecimal importe;

        /**
         * Gets the value of the informacionAduanera property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the informacionAduanera property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformacionAduanera().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TInformacionAduanera }
         * 
         * 
         * @return
         *     The value of the informacionAduanera property.
         */
        public List<TInformacionAduanera> getInformacionAduanera() {
            if (informacionAduanera == null) {
                informacionAduanera = new ArrayList<>();
            }
            return this.informacionAduanera;
        }

        /**
         * Gets the value of the cantidad property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCantidad() {
            return cantidad;
        }

        /**
         * Sets the value of the cantidad property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCantidad(BigDecimal value) {
            this.cantidad = value;
        }

        /**
         * Gets the value of the unidad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidad() {
            return unidad;
        }

        /**
         * Sets the value of the unidad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidad(String value) {
            this.unidad = value;
        }

        /**
         * Gets the value of the noIdentificacion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoIdentificacion() {
            return noIdentificacion;
        }

        /**
         * Sets the value of the noIdentificacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoIdentificacion(String value) {
            this.noIdentificacion = value;
        }

        /**
         * Gets the value of the descripcion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Sets the value of the descripcion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Gets the value of the valorUnitario property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        /**
         * Sets the value of the valorUnitario property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorUnitario(BigDecimal value) {
            this.valorUnitario = value;
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
