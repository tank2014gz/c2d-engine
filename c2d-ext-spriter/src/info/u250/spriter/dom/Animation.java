//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.25 at 09:27:47 上午 CST 
//

package info.u250.spriter.dom;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for Animation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Animation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainline" type="{}MainLine"/>
 *         &lt;element name="timeline" type="{}TimeLine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="looping" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class Animation {

	protected MainLine mainline;

	protected List<TimeLine> timeline;

	protected Integer id;

	protected String name;

	protected Integer length;

	protected Boolean looping;

	/**
	 * Gets the value of the mainline property.
	 * 
	 * @return possible object is {@link MainLine }
	 * 
	 */
	public MainLine getMainline() {
		return mainline;
	}

	/**
	 * Sets the value of the mainline property.
	 * 
	 * @param value
	 *            allowed object is {@link MainLine }
	 * 
	 */
	public void setMainline(MainLine value) {
		this.mainline = value;
	}

	/**
	 * Gets the value of the timeline property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the timeline property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTimeline().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TimeLine }
	 * 
	 * 
	 */
	public List<TimeLine> getTimeline() {
		if (timeline == null) {
			timeline = new ArrayList<TimeLine>();
		}
		return this.timeline;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the length property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * Sets the value of the length property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLength(Integer value) {
		this.length = value;
	}

	/**
	 * Gets the value of the looping property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isLooping() {
		return looping;
	}

	/**
	 * Sets the value of the looping property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setLooping(Boolean value) {
		this.looping = value;
	}

}
