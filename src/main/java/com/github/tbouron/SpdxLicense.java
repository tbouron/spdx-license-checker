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

import org.apache.commons.lang3.StringUtils;

public enum SpdxLicense {
    GLIDE("3dfx Glide License", "Glide", false),
    ABSTYLES("Abstyles License", "Abstyles", false),
    AFL_1_1("Academic Free License v1.1", "AFL-1.1", true),
    AFL_1_2("Academic Free License v1.2", "AFL-1.2", true),
    AFL_2_0("Academic Free License v2.0", "AFL-2.0", true),
    AFL_2_1("Academic Free License v2.1", "AFL-2.1", true),
    AFL_3_0("Academic Free License v3.0", "AFL-3.0", true),
    AMPAS("Academy of Motion Picture Arts and Sciences BSD", "AMPAS", false),
    APL_1_0("Adaptive Public License 1.0", "APL-1.0", true),
    ADOBE_GLYPH("Adobe Glyph List License", "Adobe-Glyph", false),
    APAFML("Adobe Postscript AFM License", "APAFML", false),
    ADOBE_2006("Adobe Systems Incorporated Source Code License Agreement", "Adobe-2006", false),
    AGPL_1_0("Affero General Public License v1.0", "AGPL-1.0", false),
    AFMPARSE("Afmparse License", "Afmparse", false),
    ALADDIN("Aladdin Free Public License", "Aladdin", false),
    ADSL("Amazon Digital Services License", "ADSL", false),
    AMDPLPA("AMD's plpa_map.c License", "AMDPLPA", false),
    ANTLR_PD("ANTLR Software Rights Notice", "ANTLR-PD", false),
    APACHE_1_0("Apache License 1.0", "Apache-1.0", false),
    APACHE_1_1("Apache License 1.1", "Apache-1.1", true),
    APACHE_2_0("Apache License 2.0", "Apache-2.0", true),
    AML("Apple MIT License", "AML", false),
    APSL_1_0("Apple Public Source License 1.0", "APSL-1.0", true),
    APSL_1_1("Apple Public Source License 1.1", "APSL-1.1", true),
    APSL_1_2("Apple Public Source License 1.2", "APSL-1.2", true),
    APSL_2_0("Apple Public Source License 2.0", "APSL-2.0", true),
    ARTISTIC_1_0("Artistic License 1.0", "Artistic-1.0", true),
    ARTISTIC_1_0_PERL("Artistic License 1.0 (Perl)", "Artistic-1.0-Perl", true),
    ARTISTIC_1_0_CL8("Artistic License 1.0 w/clause 8", "Artistic-1.0-cl8", true),
    ARTISTIC_2_0("Artistic License 2.0", "Artistic-2.0", true),
    AAL("Attribution Assurance License", "AAL", true),
    BAHYPH("Bahyph License", "Bahyph", false),
    BARR("Barr License", "Barr", false),
    BEERWARE("Beerware License", "Beerware", false),
    BITTORRENT_1_0("BitTorrent Open Source License v1.0", "BitTorrent-1.0", false),
    BITTORRENT_1_1("BitTorrent Open Source License v1.1", "BitTorrent-1.1", false),
    BSL_1_0("Boost Software License 1.0", "BSL-1.0", true),
    BORCEUX("Borceux license", "Borceux", false),
    BSD_2_ClAUSE("BSD 2-clause \"Simplified\" License", "BSD-2-Clause", true),
    BSD_2_CLAUSE_FREEBSD("BSD 2-clause FreeBSD License", "BSD-2-Clause-FreeBSD", false),
    BSD_2_CLAUSE_NETBSD("BSD 2-clause NetBSD License", "BSD-2-Clause-NetBSD", false),
    BSD_3_ClAUSE("BSD 3-clause \"New\" or \"Revised\" License", "BSD-3-Clause", true),
    BSD_3_CLAUSE_CLEAR("BSD 3-clause Clear License", "BSD-3-Clause-Clear", false),
    BSD_4_ClAUSE("BSD 4-clause \"Original\" or \"Old\" License", "BSD-4-Clause", false),
    BSD_PROTECTION("BSD Protection License", "BSD-Protection", false),
    BSD_3_CLAUSE_ATTRIBUTION("BSD with attribution", "BSD-3-Clause-Attribution", false),
    BSD_0("BSD Zero Clause License", "0BSD", true),
    BSD_4_CLAUSE_UC("BSD-4-Clause (University of California-Specific)", "BSD-4-Clause-UC", false),
    BZIP2_1_0_5("bzip2 and libbzip2 License v1.0.5", "bzip2-1.0.5", false),
    BZIP2_1_0_6("bzip2 and libbzip2 License v1.0.6", "bzip2-1.0.6", false),
    CALDERA("Caldera License", "Caldera", false),
    CECILL_1_0("CeCILL Free Software License Agreement v1.0", "CECILL-1.0", false),
    CECILL_1_1("CeCILL Free Software License Agreement v1.1", "CECILL-1.1", false),
    CECILL_2_0("CeCILL Free Software License Agreement v2.0", "CECILL-2.0", false),
    CECILL_2_1("CeCILL Free Software License Agreement v2.1", "CECILL-2.1", true),
    CECILL_B("CeCILL-B Free Software License Agreement", "CECILL-B", false),
    CECILL_C("CeCILL-C Free Software License Agreement", "CECILL-C", false),
    CLARTISTIC("Clarified Artistic License", "ClArtistic", false),
    MIT_CMU("CMU License", "MIT-CMU", false),
    CNRI_JYTHON("CNRI Jython License", "CNRI-Jython", false),
    CNRI_PYTHON("CNRI Python License", "CNRI-Python", true),
    CNRI_PYTHON_GPL_COMPATIBLE("CNRI Python Open Source GPL Compatible License Agreement", "CNRI-Python-GPL-Compatible", false),
    CPOL_1_02("Code Project Open License 1.02", "CPOL-1.02", false),
    CDDL_1_0("Common Development and Distribution License 1.0", "CDDL-1.0", true),
    CDDL_1_1("Common Development and Distribution License 1.1", "CDDL-1.1", false),
    CPAL_1_0("Common Public Attribution License 1.0", "CPAL-1.0", true),
    CPL_1_0("Common Public License 1.0", "CPL-1.0", true),
    CATOSL_1_1("Computer Associates Trusted Open Source License 1.1", "CATOSL-1.1", true),
    CONDOR_1_1("Condor Public License v1.1", "Condor-1.1", false),
    CC_BY_1_0("Creative Commons Attribution 1.0", "CC-BY-1.0", false),
    CC_BY_2_0("Creative Commons Attribution 2.0", "CC-BY-2.0", false),
    CC_BY_2_5("Creative Commons Attribution 2.5", "CC-BY-2.5", false),
    CC_BY_3_0("Creative Commons Attribution 3.0", "CC-BY-3.0", false),
    CC_BY_4_0("Creative Commons Attribution 4.0", "CC-BY-4.0", false),
    CC_BY_ND_1_0("Creative Commons Attribution No Derivatives 1.0", "CC-BY-ND-1.0", false),
    CC_BY_ND_2_0("Creative Commons Attribution No Derivatives 2.0", "CC-BY-ND-2.0", false),
    CC_BY_ND_2_5("Creative Commons Attribution No Derivatives 2.5", "CC-BY-ND-2.5", false),
    CC_BY_ND_3_0("Creative Commons Attribution No Derivatives 3.0", "CC-BY-ND-3.0", false),
    CC_BY_ND_4_0("Creative Commons Attribution No Derivatives 4.0", "CC-BY-ND-4.0", false),
    CC_BY_NC_1_0("Creative Commons Attribution Non Commercial 1.0", "CC-BY-NC-1.0", false),
    CC_BY_NC_2_0("Creative Commons Attribution Non Commercial 2.0", "CC-BY-NC-2.0", false),
    CC_BY_NC_2_5("Creative Commons Attribution Non Commercial 2.5", "CC-BY-NC-2.5", false),
    CC_BY_NC_3_0("Creative Commons Attribution Non Commercial 3.0", "CC-BY-NC-3.0", false),
    CC_BY_NC_4_0("Creative Commons Attribution Non Commercial 4.0", "CC-BY-NC-4.0", false),
    CC_BY_NC_ND_1_0("Creative Commons Attribution Non Commercial No Derivatives 1.0", "CC-BY-NC-ND-1.0", false),
    CC_BY_NC_ND_2_0("Creative Commons Attribution Non Commercial No Derivatives 2.0", "CC-BY-NC-ND-2.0", false),
    CC_BY_NC_ND_2_5("Creative Commons Attribution Non Commercial No Derivatives 2.5", "CC-BY-NC-ND-2.5", false),
    CC_BY_NC_ND_3_0("Creative Commons Attribution Non Commercial No Derivatives 3.0", "CC-BY-NC-ND-3.0", false),
    CC_BY_NC_ND_4_0("Creative Commons Attribution Non Commercial No Derivatives 4.0", "CC-BY-NC-ND-4.0", false),
    CC_BY_NC_SA_1_0("Creative Commons Attribution Non Commercial Share Alike 1.0", "CC-BY-NC-SA-1.0", false),
    CC_BY_NC_SA_2_0("Creative Commons Attribution Non Commercial Share Alike 2.0", "CC-BY-NC-SA-2.0", false),
    CC_BY_NC_SA_2_5("Creative Commons Attribution Non Commercial Share Alike 2.5", "CC-BY-NC-SA-2.5", false),
    CC_BY_NC_SA_3_0("Creative Commons Attribution Non Commercial Share Alike 3.0", "CC-BY-NC-SA-3.0", false),
    CC_BY_NC_SA_4_0("Creative Commons Attribution Non Commercial Share Alike 4.0", "CC-BY-NC-SA-4.0", false),
    CC_BY_SA_1_0("Creative Commons Attribution Share Alike 1.0", "CC-BY-SA-1.0", false),
    CC_BY_SA_2_0("Creative Commons Attribution Share Alike 2.0", "CC-BY-SA-2.0", false),
    CC_BY_SA_2_5("Creative Commons Attribution Share Alike 2.5", "CC-BY-SA-2.5", false),
    CC_BY_SA_3_0("Creative Commons Attribution Share Alike 3.0", "CC-BY-SA-3.0", false),
    CC_BY_SA_4_0("Creative Commons Attribution Share Alike 4.0", "CC-BY-SA-4.0", false),
    CC0_1_0("Creative Commons Zero v1.0 Universal", "CC0-1.0", false),
    CROSSWORD("Crossword License", "Crossword", false),
    CRYSTALSTACKER("CrystalStacker License", "CrystalStacker", false),
    CUA_OPL_1_0("CUA Office Public License v1.0", "CUA-OPL-1.0", true),
    CUBE("Cube License", "Cube", false),
    CURL("curl License", "curl", false),
    D_FSL_1_0("Deutsche Freie Software Lizenz", "D-FSL-1.0", false),
    DIFFMARK("diffmark license", "diffmark", false),
    WTFPL("Do What The F*ck You Want To Public License", "WTFPL", false),
    DOC("DOC License", "DOC", false),
    DOTSEQN("Dotseqn License", "Dotseqn", false),
    DSDP("DSDP License", "DSDP", false),
    DVIPDFM("dvipdfm License", "dvipdfm", false),
    EPL_1_0("Eclipse Public License 1.0", "EPL-1.0", true),
    ECL_1_0("Educational Community License v1.0", "ECL-1.0", true),
    ECL_2_0("Educational Community License v2.0", "ECL-2.0", true),
    EGENIX("eGenix.com Public License 1.1.0", "eGenix", false),
    EFL_1_0("Eiffel Forum License v1.0", "EFL-1.0", true),
    EFL_2_0("Eiffel Forum License v2.0", "EFL-2.0", true),
    MIT_ADVERTISING("Enlightenment License (e16)", "MIT-advertising", false),
    MIT_ENNA("enna License", "MIT-enna", false),
    ENTESSA("Entessa Public License v1.0", "Entessa", true),
    ERLPL_1_1("Erlang Public License v1.1", "ErlPL-1.1", false),
    EUDATAGRID("EU DataGrid Software License", "EUDatagrid", true),
    EUPL_1_0("European Union Public License 1.0", "EUPL-1.0", false),
    EUPL_1_1("European Union Public License 1.1", "EUPL-1.1", true),
    EUROSYM("Eurosym License", "Eurosym", false),
    FAIR("Fair License", "Fair", true),
    MIT_FEH("feh License", "MIT-feh", false),
    FRAMEWORX_1_0("Frameworx Open License 1.0", "Frameworx-1.0", true),
    FREEIMAGE("FreeImage Public License v1.0", "FreeImage", false),
    FTL("Freetype Project License", "FTL", false),
    FSFAP("FSF All Permissive License", "FSFAP", false),
    FSFUL("FSF Unlimited License", "FSFUL", false),
    FSFULLR("FSF Unlimited License (with License Retention)", "FSFULLR", false),
    GIFTWARE("Giftware License", "Giftware", false),
    GL2PS("GL2PS License", "GL2PS", false),
    GLULXE("Glulxe License", "Glulxe", false),
    AGPL_3_0("GNU Affero General Public License v3.0", "AGPL-3.0", true),
    GFDL_1_1("GNU Free Documentation License v1.1", "GFDL-1.1", false),
    GFDL_1_2("GNU Free Documentation License v1.2", "GFDL-1.2", false),
    GFDL_1_3("GNU Free Documentation License v1.3", "GFDL-1.3", false),
    GPL_1_0("GNU General Public License v1.0 only", "GPL-1.0", false),
    GPL_2_0("GNU General Public License v2.0 only", "GPL-2.0", true),
    GPL_3_0("GNU General Public License v3.0 only", "GPL-3.0", true),
    LGPL_2_1("GNU Lesser General Public License v2.1 only", "LGPL-2.1", true),
    LGPL_3_0("GNU Lesser General Public License v3.0 only", "LGPL-3.0", true),
    LGPL_2_0("GNU Library General Public License v2 only", "LGPL-2.0", true),
    GNUPLOT("gnuplot License", "gnuplot", false),
    GSOAP_1_3B("gSOAP Public License v1.3b", "gSOAP-1.3b", false),
    HASKELLREPORT("Haskell Language Report License", "HaskellReport", false),
    HPND("Historic Permission Notice and Disclaimer", "HPND", true),
    IBM_PIBS("IBM PowerPC Initialization and Boot Software", "IBM-pibs", false),
    IPL_1_0("IBM Public License v1.0", "IPL-1.0", true),
    ICU("ICU License", "ICU", false),
    IMAGEMAGICK("ImageMagick License", "ImageMagick", false),
    IMATIX("iMatix Standard Function Library Agreement", "iMatix", false),
    IMLIB2("Imlib2 License", "Imlib2", false),
    IJG("Independent JPEG Group License", "IJG", false),
    INFO_ZIP("Info-ZIP License", "Info-ZIP", false),
    INTEL_ACPI("Intel ACPI Software License Agreement", "Intel-ACPI", false),
    INTEL("Intel Open Source License", "Intel", true),
    INTERBASE_1_0("Interbase Public License v1.0", "Interbase-1.0", false),
    IPA("IPA Font License", "IPA", true),
    ISC("ISC License", "ISC", true),
    JASPER_2_0("JasPer License", "JasPer-2.0", false),
    JSON("JSON License", "JSON", false),
    LPPL_1_0("LaTeX Project Public License v1.0", "LPPL-1.0", false),
    LPPL_1_1("LaTeX Project Public License v1.1", "LPPL-1.1", false),
    LPPL_1_2("LaTeX Project Public License v1.2", "LPPL-1.2", false),
    LPPL_1_3A("LaTeX Project Public License v1.3a", "LPPL-1.3a", false),
    LPPL_1_3C("LaTeX Project Public License v1.3c", "LPPL-1.3c", true),
    LATEX2E("Latex2e License", "Latex2e", false),
    BSD_3_CLAUSE_LBNL("Lawrence Berkeley National Labs BSD variant license", "BSD-3-Clause-LBNL", false),
    LEPTONICA("Leptonica License", "Leptonica", false),
    LGPLLR("Lesser General Public License For Linguistic Resources", "LGPLLR", false),
    LIBPNG("libpng License", "Libpng", false),
    LIBTIFF("libtiff License", "libtiff", false),
    LAL_1_2("Licence Art Libre 1.2", "LAL-1.2", false),
    LAL_1_3("Licence Art Libre 1.3", "LAL-1.3", false),
    LILIQ_P_1_1("Licence Libre du Québec – Permissive version 1.1", "LiLiQ-P-1.1", true),
    LILIQ_RPLUS_1_1("Licence Libre du Québec – Réciprocité forte version 1.1", "LiLiQ-Rplus-1.1", true),
    LILIQ_R_1_1("Licence Libre du Québec – Réciprocité version 1.1", "LiLiQ-R-1.1", true),
    LPL_1_02("Lucent Public License v1.02", "LPL-1.02", true),
    LPL_1_0("Lucent Public License Version 1.0", "LPL-1.0", true),
    MAKEINDEX("MakeIndex License", "MakeIndex", false),
    MTLL("Matrix Template Library License", "MTLL", false),
    MS_PL("Microsoft Public License", "MS-PL", true),
    MS_RL("Microsoft Reciprocal License", "MS-RL", true),
    MIROS("MirOS Licence", "MirOS", true),
    MITNFA("MIT +no-false-attribs license", "MITNFA", false),
    MIT("MIT License", "MIT", true),
    MOTOSOTO("Motosoto License", "Motosoto", true),
    MPL_1_0("Mozilla Public License 1.0", "MPL-1.0", true),
    MPL_1_1("Mozilla Public License 1.1", "MPL-1.1", true),
    MPL_2_0("Mozilla Public License 2.0", "MPL-2.0", true),
    MPL_2_0_NO_COPYLEFT_EXCEPTION("Mozilla Public License 2.0 (no copyleft exception)", "MPL-2.0-no-copyleft-exception", true),
    MPICH2("mpich2 License", "mpich2", false),
    MULTICS("Multics License", "Multics", true),
    MUP("Mup License", "Mup", false),
    NASA_1_3("NASA Open Source Agreement 1.3", "NASA-1.3", true),
    NAUMEN("Naumen Public License", "Naumen", true),
    NBPL_1_0("Net Boolean Public License v1", "NBPL-1.0", false),
    NETCDF("NetCDF license", "NetCDF", false),
    NGPL("Nethack General Public License", "NGPL", true),
    NOSL("Netizen Open Source License", "NOSL", false),
    NPL_1_0("Netscape Public License v1.0", "NPL-1.0", false),
    NPL_1_1("Netscape Public License v1.1", "NPL-1.1", false),
    NEWSLETR("Newsletr License", "Newsletr", false),
    NLPL("No Limit Public License", "NLPL", false),
    NOKIA("Nokia Open Source License", "Nokia", true),
    NPOSL_3_0("Non-Profit Open Software License 3.0", "NPOSL-3.0", true),
    NLOD_1_0("Norwegian Licence for Open Government Data", "NLOD-1.0", false),
    NOWEB("Noweb License", "Noweb", false),
    NRL("NRL License", "NRL", false),
    NTP("NTP License", "NTP", true),
    NUNIT("Nunit License", "Nunit", false),
    OCLC_2_0("OCLC Research Public License 2.0", "OCLC-2.0", true),
    ODBL_1_0("ODC Open Database License v1.0", "ODbL-1.0", false),
    PDDL_1_0("ODC Public Domain Dedication & License 1.0", "PDDL-1.0", false),
    OCCT_PL("Open CASCADE Technology Public License", "OCCT-PL", false),
    OGTSL("Open Group Test Suite License", "OGTSL", true),
    OLDAP_2_2_2("Open LDAP Public License 2.2.2", "OLDAP-2.2.2", false),
    OLDAP_1_1("Open LDAP Public License v1.1", "OLDAP-1.1", false),
    OLDAP_1_2("Open LDAP Public License v1.2", "OLDAP-1.2", false),
    OLDAP_1_3("Open LDAP Public License v1.3", "OLDAP-1.3", false),
    OLDAP_1_4("Open LDAP Public License v1.4", "OLDAP-1.4", false),
    OLDAP_2_0("Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)", "OLDAP-2.0", false),
    OLDAP_2_0_1("Open LDAP Public License v2.0.1", "OLDAP-2.0.1", false),
    OLDAP_2_1("Open LDAP Public License v2.1", "OLDAP-2.1", false),
    OLDAP_2_2("Open LDAP Public License v2.2", "OLDAP-2.2", false),
    OLDAP_2_2_1("Open LDAP Public License v2.2.1", "OLDAP-2.2.1", false),
    OLDAP_2_3("Open LDAP Public License v2.3", "OLDAP-2.3", false),
    OLDAP_2_4("Open LDAP Public License v2.4", "OLDAP-2.4", false),
    OLDAP_2_5("Open LDAP Public License v2.5", "OLDAP-2.5", false),
    OLDAP_2_6("Open LDAP Public License v2.6", "OLDAP-2.6", false),
    OLDAP_2_7("Open LDAP Public License v2.7", "OLDAP-2.7", false),
    OLDAP_2_8("Open LDAP Public License v2.8", "OLDAP-2.8", false),
    OML("Open Market License", "OML", false),
    OPL_1_0("Open Public License v1.0", "OPL-1.0", false),
    OSL_1_0("Open Software License 1.0", "OSL-1.0", true),
    OSL_1_1("Open Software License 1.1", "OSL-1.1", false),
    OSL_2_0("Open Software License 2.0", "OSL-2.0", true),
    OSL_2_1("Open Software License 2.1", "OSL-2.1", true),
    OSL_3_0("Open Software License 3.0", "OSL-3.0", true),
    OPENSSL("OpenSSL License", "OpenSSL", false),
    OSET_PL_2_1("OSET Public License version 2.1", "OSET-PL-2.1", true),
    PHP_3_0("PHP License v3.0", "PHP-3.0", true),
    PHP_3_01("PHP License v3.01", "PHP-3.01", false),
    PLEXUS("Plexus Classworlds License", "Plexus", false),
    POSTGRESQL("PostgreSQL License", "PostgreSQL", true),
    PSFRAG("psfrag License", "psfrag", false),
    PSUTILS("psutils License", "psutils", false),
    PYTHON_2_0("Python License 2.0", "Python-2.0", true),
    QPL_1_0("Q Public License 1.0", "QPL-1.0", true),
    QHULL("Qhull License", "Qhull", false),
    RDISC("Rdisc License", "Rdisc", false),
    RPSL_1_0("RealNetworks Public Source License v1.0", "RPSL-1.0", true),
    RPL_1_1("Reciprocal Public License 1.1", "RPL-1.1", true),
    RPL_1_5("Reciprocal Public License 1.5", "RPL-1.5", true),
    RHECOS_1_1("Red Hat eCos Public License v1.1", "RHeCos-1.1", false),
    RSCPL("Ricoh Source Code Public License", "RSCPL", true),
    RSA_MD("RSA Message-Digest License", "RSA-MD", false),
    RUBY("Ruby License", "Ruby", false),
    SAX_PD("Sax Public Domain Notice", "SAX-PD", false),
    SAXPATH("Saxpath License", "Saxpath", false),
    SCEA("SCEA Shared Source License", "SCEA", false),
    SWL("Scheme Widget Library (SWL) Software License Agreement", "SWL", false),
    SMPPL("Secure Messaging Protocol Public License", "SMPPL", false),
    SENDMAIL("Sendmail License", "Sendmail", false),
    SGI_B_1_0("SGI Free Software License B v1.0", "SGI-B-1.0", false),
    SGI_B_1_1("SGI Free Software License B v1.1", "SGI-B-1.1", false),
    SGI_B_2_0("SGI Free Software License B v2.0", "SGI-B-2.0", false),
    OFL_1_0("SIL Open Font License 1.0", "OFL-1.0", false),
    OFL_1_1("SIL Open Font License 1.1", "OFL-1.1", true),
    SIMPL_2_0("Simple Public License 2.0", "SimPL-2.0", true),
    SLEEPYCAT("Sleepycat License", "Sleepycat", true),
    SNIA("SNIA Public License 1.1", "SNIA", false),
    SPENCER_86("Spencer License 86", "Spencer-86", false),
    SPENCER_94("Spencer License 94", "Spencer-94", false),
    SPENCER_99("Spencer License 99", "Spencer-99", false),
    SMLNJ("Standard ML of New Jersey License", "SMLNJ", false),
    SUGARCRM_1_1_3("SugarCRM Public License v1.1.3", "SugarCRM-1.1.3", false),
    SISSL("Sun Industry Standards Source License v1.1", "SISSL", true),
    SISSL_1_2("Sun Industry Standards Source License v1.2", "SISSL-1.2", false),
    SPL_1_0("Sun Public License v1.0", "SPL-1.0", true),
    WATCOM_1_0("Sybase Open Watcom Public License 1.0", "Watcom-1.0", true),
    TCL("TCL/TK License", "TCL", false),
    UNLICENSE("The Unlicense", "Unlicense", false),
    TMATE("TMate Open Source License", "TMate", false),
    TORQUE_1_1("TORQUE v2.5+ Software License v1.1", "TORQUE-1.1", false),
    TOSL("Trusster Open Source License", "TOSL", false),
    UNICODE_TOU("Unicode Terms of Use", "Unicode-TOU", false),
    UPL_1_0("Universal Permissive License v1.0", "UPL-1.0", true),
    NCSA("University of Illinois/NCSA Open Source License", "NCSA", true),
    VIM("Vim License", "Vim", false),
    VOSTROM("VOSTROM Public License for Open Source", "VOSTROM", false),
    VSL_1_0("Vovida Software License v1.0", "VSL-1.0", true),
    W3C_19980720("W3C Software Notice and License (1998-07-20)", "W3C-19980720", false),
    W3C("W3C Software Notice and License (2002-12-31)", "W3C", true),
    WSUIPA("Wsuipa License", "Wsuipa", false),
    XNET("X.Net License", "Xnet", true),
    X11("X11 License", "X11", false),
    XEROX("Xerox License", "Xerox", false),
    XFREE86_1_1("XFree86 License 1.1", "XFree86-1.1", false),
    XINETD("xinetd License", "xinetd", false),
    XPP("XPP License", "xpp", false),
    XSKAT("XSkat License", "XSkat", false),
    YPL_1_0("Yahoo! Public License v1.0", "YPL-1.0", false),
    YPL_1_1("Yahoo! Public License v1.1", "YPL-1.1", false),
    ZED("Zed License", "Zed", false),
    ZEND_2_0("Zend License v2.0", "Zend-2.0", false),
    ZIMBRA_1_3("Zimbra Public License v1.3", "Zimbra-1.3", false),
    ZIMBRA_1_4("Zimbra Public License v1.4", "Zimbra-1.4", false),
    ZLIB("zlib License", "Zlib", true),
    ZLIB_ACKNOWLEDGEMENT("zlib/libpng License with Acknowledgement", "zlib-acknowledgement", false),
    ZPL_1_1("Zope Public License 1.1", "ZPL-1.1", false),
    ZPL_2_0("Zope Public License 2.0", "ZPL-2.0", true),
    ZPL_2_1("Zope Public License 2.1", "ZPL-2.1", false);

    public final String name;
    public final String id;
    public final boolean osgiApproved;

    SpdxLicense(String name, String id, boolean osgiApproved) {
        this.name = name;
        this.id = id;
        this.osgiApproved = osgiApproved;
    }

    /**
     * Returns an instance of {@link SpdxLicense} from a given ID.
     *
     * @param id A license ID
     * @return An instance of {@link SpdxLicense} if the ID is a valid SPDX license ID. Null otherwise.
     */
    public static SpdxLicense fromId(String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }

        for (SpdxLicense license : SpdxLicense.values()) {
            if (id.equals(license.id)) {
                return license;
            }
        }

        return null;
    }

    /**
     * Returns an instance of {@link SpdxLicense} from a given name.
     *
     * @param name A license name
     * @return An instance of {@link SpdxLicense} if the name is a valid SPDX license name. Null otherwise.
     */
    public static SpdxLicense fromName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }

        for (SpdxLicense license : SpdxLicense.values()) {
            if (name.equals(license.name)) {
                return license;
            }
        }

        return null;
    }

    /**
     * Checks if the given ID is a valid SPDX license ID.
     *
     * @param id A license ID
     * @return True if the given ID is a valid SPDX license ID. False otherwise.
     */
    public static boolean isValidId(String id) {
        return SpdxLicense.fromId(id) != null;
    }

    /**
     * Checks if the given name is a valid SPDX license name.
     *
     * @param name A license name
     * @return True if the given name is a valid SPDX license name. False otherwise.
     */
    public static boolean isValidName(String name) {
        return SpdxLicense.fromName(name) != null;
    }
}
