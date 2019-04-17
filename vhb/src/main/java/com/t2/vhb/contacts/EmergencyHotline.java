/*
 *
 * Created by Wes Turney on 12/17/13.
 *
 * VirtualHopeBox
 *
 * Copyright  2009-2014 United States Government as represented by
 * the Chief Information Officer of the National Center for Telehealth
 * and Technology. All Rights Reserved.
 *
 * Copyright  2009-2014 Contributors. All Rights Reserved.
 *
 * THIS OPEN SOURCE AGREEMENT ("AGREEMENT") DEFINES THE RIGHTS OF USE,
 * REPRODUCTION, DISTRIBUTION, MODIFICATION AND REDISTRIBUTION OF CERTAIN
 * COMPUTER SOFTWARE ORIGINALLY RELEASED BY THE UNITED STATES GOVERNMENT
 * AS REPRESENTED BY THE GOVERNMENT AGENCY LISTED BELOW ("GOVERNMENT AGENCY").
 * THE UNITED STATES GOVERNMENT, AS REPRESENTED BY GOVERNMENT AGENCY, IS AN
 * INTENDED THIRD-PARTY BENEFICIARY OF ALL SUBSEQUENT DISTRIBUTIONS OR
 * REDISTRIBUTIONS OF THE SUBJECT SOFTWARE. ANYONE WHO USES, REPRODUCES,
 * DISTRIBUTES, MODIFIES OR REDISTRIBUTES THE SUBJECT SOFTWARE, AS DEFINED
 * HEREIN, OR ANY PART THEREOF, IS, BY THAT ACTION, ACCEPTING IN FULL THE
 * RESPONSIBILITIES AND OBLIGATIONS CONTAINED IN THIS AGREEMENT.
 *
 * Government Agency: The National Center for Telehealth and Technology
 * Government Agency Original Software Designation: VirtualHopeBox001
 * Government Agency Original Software Title: VirtualHopeBox
 * User Registration Requested. Please send email
 * with your contact information to: robert.a.kayl.civ@mail.mil
 * Government Agency Point of Contact for Original Software: robert.a.kayl.civ@mail.mil
 *
 */
package com.t2.vhb.contacts;

/**
 * @author wes
 * 
 */
public enum EmergencyHotline {
	SUICIDE("Suicide Hotline", "tel:1112223333"),
	OUTREACH_CENTER("Outreach Center Hotline", "tel:1112223333"),
	DCOE_OUTREACH("DCoE Outreach Hotline", "tel:1112223333");

	private final String mName;
	private final String mUri;

	EmergencyHotline(String name, String uri) {
		mName = name;
		mUri = uri;
	}

	public String getName() {
		return mName;
	}

	public String getUri() {
		return mUri;
	}

}
