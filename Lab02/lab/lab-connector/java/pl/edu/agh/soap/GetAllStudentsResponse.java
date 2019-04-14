
package pl.edu.agh.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllStudentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllStudentsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementsWraper" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Element" type="{http://soap.agh.edu.pl/}studentInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "getAllStudentsResponse", propOrder = {
    "elementsWraper"
})
public class GetAllStudentsResponse {

    @XmlElement(name = "ElementsWraper")
    protected GetAllStudentsResponse.ElementsWraper elementsWraper;

    /**
     * Gets the value of the elementsWraper property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllStudentsResponse.ElementsWraper }
     *     
     */
    public GetAllStudentsResponse.ElementsWraper getElementsWraper() {
        return elementsWraper;
    }

    /**
     * Sets the value of the elementsWraper property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllStudentsResponse.ElementsWraper }
     *     
     */
    public void setElementsWraper(GetAllStudentsResponse.ElementsWraper value) {
        this.elementsWraper = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Element" type="{http://soap.agh.edu.pl/}studentInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "element"
    })
    public static class ElementsWraper {

        @XmlElement(name = "Element")
        protected List<StudentInstance> element;

        /**
         * Gets the value of the element property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentInstance }
         * 
         * 
         */
        public List<StudentInstance> getElement() {
            if (element == null) {
                element = new ArrayList<StudentInstance>();
            }
            return this.element;
        }

    }

}
