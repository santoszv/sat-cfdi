//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.TuristaPasajeroExtranjero;

import java.io.Serializable;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element name="datosTransito">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Via" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <enumeration value="Aérea"/>
 *                       <enumeration value="Marítima"/>
 *                       <enumeration value="Terrestre"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="TipoId" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="NumeroId" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Nacionalidad" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="EmpresaTransporte" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="IdTransporte" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       <attribute name="fechadeTransito" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="tipoTransito" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Arribo"/>
 *             <enumeration value="Salida"/>
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
    "datosTransito"
})
@XmlRootElement(name = "TuristaPasajeroExtranjero")
public class TuristaPasajeroExtranjero
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected TuristaPasajeroExtranjero.DatosTransito datosTransito;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "fechadeTransito", required = true)
    protected XMLGregorianCalendar fechadeTransito;
    @XmlAttribute(name = "tipoTransito", required = true)
    protected String tipoTransito;

    /**
     * Gets the value of the datosTransito property.
     * 
     * @return
     *     possible object is
     *     {@link TuristaPasajeroExtranjero.DatosTransito }
     *     
     */
    public TuristaPasajeroExtranjero.DatosTransito getDatosTransito() {
        return datosTransito;
    }

    /**
     * Sets the value of the datosTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TuristaPasajeroExtranjero.DatosTransito }
     *     
     */
    public void setDatosTransito(TuristaPasajeroExtranjero.DatosTransito value) {
        this.datosTransito = value;
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
     * Gets the value of the fechadeTransito property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechadeTransito() {
        return fechadeTransito;
    }

    /**
     * Sets the value of the fechadeTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechadeTransito(XMLGregorianCalendar value) {
        this.fechadeTransito = value;
    }

    /**
     * Gets the value of the tipoTransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransito() {
        return tipoTransito;
    }

    /**
     * Sets the value of the tipoTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransito(String value) {
        this.tipoTransito = value;
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
     *       <attribute name="Via" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <enumeration value="Aérea"/>
     *             <enumeration value="Marítima"/>
     *             <enumeration value="Terrestre"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="TipoId" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="NumeroId" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Nacionalidad" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="EmpresaTransporte" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="IdTransporte" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DatosTransito
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlAttribute(name = "Via", required = true)
        protected String via;
        @XmlAttribute(name = "TipoId", required = true)
        protected String tipoId;
        @XmlAttribute(name = "NumeroId", required = true)
        protected String numeroId;
        @XmlAttribute(name = "Nacionalidad", required = true)
        protected String nacionalidad;
        @XmlAttribute(name = "EmpresaTransporte", required = true)
        protected String empresaTransporte;
        @XmlAttribute(name = "IdTransporte")
        protected String idTransporte;

        /**
         * Gets the value of the via property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVia() {
            return via;
        }

        /**
         * Sets the value of the via property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVia(String value) {
            this.via = value;
        }

        /**
         * Gets the value of the tipoId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoId() {
            return tipoId;
        }

        /**
         * Sets the value of the tipoId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoId(String value) {
            this.tipoId = value;
        }

        /**
         * Gets the value of the numeroId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroId() {
            return numeroId;
        }

        /**
         * Sets the value of the numeroId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroId(String value) {
            this.numeroId = value;
        }

        /**
         * Gets the value of the nacionalidad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNacionalidad() {
            return nacionalidad;
        }

        /**
         * Sets the value of the nacionalidad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNacionalidad(String value) {
            this.nacionalidad = value;
        }

        /**
         * Gets the value of the empresaTransporte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmpresaTransporte() {
            return empresaTransporte;
        }

        /**
         * Sets the value of the empresaTransporte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmpresaTransporte(String value) {
            this.empresaTransporte = value;
        }

        /**
         * Gets the value of the idTransporte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdTransporte() {
            return idTransporte;
        }

        /**
         * Sets the value of the idTransporte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdTransporte(String value) {
            this.idTransporte = value;
        }

    }

}
