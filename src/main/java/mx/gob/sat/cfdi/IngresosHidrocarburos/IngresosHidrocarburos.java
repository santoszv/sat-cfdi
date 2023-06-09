//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package mx.gob.sat.cfdi.IngresosHidrocarburos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         <element name="DocumentoRelacionado" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="FolioFiscalVinculado" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <length value="36"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="FechaFolioFiscalVinculado" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Mes" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/hidrocarburos}Meses" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Version" use="required" fixed="1.0">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NumeroContrato" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="50"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="[^|]{1,50}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ContraprestacionPagadaOperador" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *       <attribute name="Porcentaje" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="3"/>
 *             <minInclusive value="0.001"/>
 *             <maxInclusive value="100.000"/>
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
    "documentoRelacionado"
})
@XmlRootElement(name = "IngresosHidrocarburos")
public class IngresosHidrocarburos
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "DocumentoRelacionado", required = true)
    protected List<IngresosHidrocarburos.DocumentoRelacionado> documentoRelacionado;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "NumeroContrato", required = true)
    protected String numeroContrato;
    @XmlAttribute(name = "ContraprestacionPagadaOperador", required = true)
    protected BigDecimal contraprestacionPagadaOperador;
    @XmlAttribute(name = "Porcentaje", required = true)
    protected BigDecimal porcentaje;

    /**
     * Gets the value of the documentoRelacionado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentoRelacionado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoRelacionado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IngresosHidrocarburos.DocumentoRelacionado }
     * 
     * 
     * @return
     *     The value of the documentoRelacionado property.
     */
    public List<IngresosHidrocarburos.DocumentoRelacionado> getDocumentoRelacionado() {
        if (documentoRelacionado == null) {
            documentoRelacionado = new ArrayList<>();
        }
        return this.documentoRelacionado;
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
     * Gets the value of the numeroContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Sets the value of the numeroContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Gets the value of the contraprestacionPagadaOperador property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContraprestacionPagadaOperador() {
        return contraprestacionPagadaOperador;
    }

    /**
     * Sets the value of the contraprestacionPagadaOperador property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContraprestacionPagadaOperador(BigDecimal value) {
        this.contraprestacionPagadaOperador = value;
    }

    /**
     * Gets the value of the porcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
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
     *       <attribute name="FolioFiscalVinculado" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <length value="36"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="FechaFolioFiscalVinculado" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             <whiteSpace value="collapse"/>
     *             <pattern value="([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Mes" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/hidrocarburos}Meses" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DocumentoRelacionado
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        @XmlAttribute(name = "FolioFiscalVinculado", required = true)
        protected String folioFiscalVinculado;
        @XmlAttribute(name = "FechaFolioFiscalVinculado", required = true)
        protected XMLGregorianCalendar fechaFolioFiscalVinculado;
        @XmlAttribute(name = "Mes", required = true)
        protected String mes;

        /**
         * Gets the value of the folioFiscalVinculado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolioFiscalVinculado() {
            return folioFiscalVinculado;
        }

        /**
         * Sets the value of the folioFiscalVinculado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFolioFiscalVinculado(String value) {
            this.folioFiscalVinculado = value;
        }

        /**
         * Gets the value of the fechaFolioFiscalVinculado property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaFolioFiscalVinculado() {
            return fechaFolioFiscalVinculado;
        }

        /**
         * Sets the value of the fechaFolioFiscalVinculado property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaFolioFiscalVinculado(XMLGregorianCalendar value) {
            this.fechaFolioFiscalVinculado = value;
        }

        /**
         * Gets the value of the mes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMes() {
            return mes;
        }

        /**
         * Sets the value of the mes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMes(String value) {
            this.mes = value;
        }

    }

}
