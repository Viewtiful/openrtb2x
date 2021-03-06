/*
 * ============================================================================
 * Copyright (c) 2013, Nexage, Inc.
 * All rights reserved.
 * Provided under BSD License as follows:
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1.  Redistributions of source code must retain the above copyright notice, 
 *	 this list of conditions and the following disclaimer.
 * 2.  Redistributions in binary form must reproduce the above copyright 
 *	 notice, this list of conditions and the following disclaimer in the 
 *	 documentation and/or other materials provided with the distribution.
 * 3.  Neither the name of Nexage, Inc. nor the names of its contributors may 
 *	 be used to endorse or promote products derived from this software 
 *	 without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * ============================================================================
 */

package org.openrtb.validator;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.report.ProcessingReport;

/**
 * Test examples taken from OpenRTB v2.3 specification document. 
 */
public class OpenRtbValidatorV2_3Tests {

	private static final Logger logger = LoggerFactory.getLogger(OpenRtbValidatorV2_3Tests.class);
	
	@Test
	public void testBidRequestExample1SimpleBanner() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_requests/example1_simple_banner.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}
	
	@Test
	public void testBidRequestExample2ExpandableCreative() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_requests/example2_expandable_creative.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

	@Test
	public void testBidRequestExample3Mobile() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);
		
		String resource = "/v2_3/bid_requests/example3_mobile.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}
	
	@Test
	public void testBidRequestExample4Video() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_requests/example4_video.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

	@Test
	public void testBidRequestExample5PmpWithDirectDeal() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_requests/example5_pmp_with_direct_deal.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

	@Test
	public void testBidRequestExample6Native() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_REQUEST, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_requests/example6_native.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

	@Test
	public void testBidResponseExample1AdServedOnWinNotice() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_RESPONSE, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_responses/example1_ad_served_on_win_notice.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}
	
	@Test
	public void testBidResponseExample2VastUrlReturned() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_RESPONSE, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_responses/example2_vast_url_returned.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

	@Test
	public void testBidResponseExample3DirectDealAdServedOnWinNotice() throws IOException, ProcessingException {
		OpenRtbValidator validator = OpenRtbValidatorFactory.getValidator(OpenRtbInputType.BID_RESPONSE, OpenRtbVersion.V2_3);

		String resource = "/v2_3/bid_responses/example3_direct_deal_ad_served_on_win_notice.json";
		ProcessingReport report = validator.validate(JsonLoader.fromResource(resource));

		logger.info("validation report: " + report);
		assertTrue(resource + " is not valid", report.isSuccess());
	}

}
