/*
 * Copyright (C) 2016 Thomas Bouron.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.tbouron;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SpdxLicenseTest {

    @Test
    public void unknownIdReturnsNull() {
        final SpdxLicense spdxLicense = SpdxLicense.fromId("Unknown-Id");

        Assert.assertNull(spdxLicense);
    }

    @Test
    public void knownIdReturnsSpdxLicenseEnum() {
        final SpdxLicense spdxLicense = SpdxLicense.fromId("Adobe-2006");

        Assert.assertNotNull(spdxLicense);
        Assert.assertEquals(spdxLicense.id, SpdxLicense.ADOBE_2006.id);
        Assert.assertEquals(spdxLicense.name, SpdxLicense.ADOBE_2006.name);
        Assert.assertEquals(spdxLicense.osgiApproved, SpdxLicense.ADOBE_2006.osgiApproved);
    }

    @Test
    public void unknownNameReturnsNull() {
        final SpdxLicense spdxLicense = SpdxLicense.fromName("Unknwon SpdxLicense Name");

        Assert.assertNull(spdxLicense);
    }

    @Test
    public void knownNameReturnsSpdxLicenseEnum() {
        final SpdxLicense spdxLicense = SpdxLicense.fromName("Academy of Motion Picture Arts and Sciences BSD");

        Assert.assertNotNull(spdxLicense);
        Assert.assertEquals(spdxLicense.id, SpdxLicense.AMPAS.id);
        Assert.assertEquals(spdxLicense.name, SpdxLicense.AMPAS.name);
        Assert.assertEquals(spdxLicense.osgiApproved, SpdxLicense.AMPAS.osgiApproved);
    }

    @Test
    public void testIDChecker() {
        Map<String, Boolean> fixtures = new HashMap<String, Boolean>();
        fixtures.put("Unknown-Id", false);
        fixtures.put("BitTorrent-1.0", true);

        for (Map.Entry<String, Boolean> fixture : fixtures.entrySet()) {
            Assert.assertEquals(fixture.getValue(), SpdxLicense.isValidId(fixture.getKey()));
        }
    }

    @Test
    public void testNameChecker() {
        Map<String, Boolean> fixtures = new HashMap<String, Boolean>();
        fixtures.put("CMU License", true);
        fixtures.put("Borceux license", true);
        fixtures.put("My Private license", false);

        for (Map.Entry<String, Boolean> fixture : fixtures.entrySet()) {
            Assert.assertEquals(fixture.getValue(), SpdxLicense.isValidName(fixture.getKey()));
        }
    }
}
