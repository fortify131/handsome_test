/**
 * (c) Copyright [2015-2018] Micro Focus or one of its affiliates.
 */

package com.fortify.sample.bugtracker.alm.infra;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 *
 * This file has been taken as is from ALM REST documentation
 * available at http://almhost:port/qcbin/Help/doc_library/api_refs/REST/webframe.html
 *
 * A utility class for converting between JAXB annotated objects and XML.
 */
public class EntityMarshallingUtils {

	private EntityMarshallingUtils() {
	}

	/**
	 * @param <T>
	 *            the type to serialize
	 * @param c
	 *            the class of the type to serialize
	 * @param o
	 *            the instance containing the data to serialize
	 * @return a string representation of the data.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T> String marshal(Class<T> c, Object o) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(c);
		Marshaller marshaller = ctx.createMarshaller();
		StringWriter entityXml = new StringWriter();
		marshaller.marshal(o, entityXml);
		String entityString = entityXml.toString();
		return entityString;
	}
}
