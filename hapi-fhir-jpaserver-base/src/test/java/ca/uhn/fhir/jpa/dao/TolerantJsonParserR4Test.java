package ca.uhn.fhir.jpa.dao;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.DataFormatException;
import ca.uhn.fhir.parser.LenientErrorHandler;
import org.hl7.fhir.r4.model.Observation;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class TolerantJsonParserR4Test {

	private FhirContext myFhirContext = FhirContext.forR4();

	@Test
	public void testParseInvalidNumeric() {
		String input = "{\n" +
			"\"resourceType\": \"Observation\",\n" +
			"\"valueQuantity\": {\n" +
			"      \"value\": .5\n" +
			"   }\n" +
			"}";


		TolerantJsonParser parser = new TolerantJsonParser(myFhirContext, new LenientErrorHandler());
		Observation obs = parser.parseResource(Observation.class, input);

		assertEquals("0.5", obs.getValueQuantity().getValueElement().getValueAsString());
	}

	@Test
	public void testParseInvalidNumeric2() {
		String input = "{\n" +
			"\"resourceType\": \"Observation\",\n" +
			"\"valueQuantity\": {\n" +
			"      \"value\": .\n" +
			"   }\n" +
			"}";


		TolerantJsonParser parser = new TolerantJsonParser(myFhirContext, new LenientErrorHandler());
		try {
			parser.parseResource(Observation.class, input);
		} catch (DataFormatException e) {
			assertThat(e.getMessage(), containsString("[element=\"value\"] Invalid attribute value \".\""));
		}

	}

}
