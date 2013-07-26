/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2013  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */

package org.opens.tanaguru.rules.keystore;

/**
 * Utility class that stores remark messages keys as static String
 */
public final class RemarkMessageStore {

    // general 
    public static final String MANUAL_CHECK_ON_ELEMENTS_MSG = 
            "ManualCheckOnElements";
    public static final String TITLE_ATTR_MISSING_MSG = "TitleAttributeMissing";
    public static final String ID_MISSING_MSG = "IdMissing";
    public static final String ID_NOT_UNIQUE_MSG = "IdNotUnique";

    // doctype
    public static final String DOCTYPE_MISSING_MSG = "DoctypeMissing";
    public static final String BAD_DOCTYPE_LOCATION_MSG = "BadDoctypeLocation";
    public static final String INVALID_DOCTYPE_MSG = 
            "InvalidDoctypeDeclaration";
    
    // images
    public static final String ALT_MISSING_MSG = "AltMissing";
    public static final String DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG =
            "DecorativeElementWithNotEmptyAltAttribute";
    public static final String CHECK_ALTERNATIVE_OF_DECORATIVE_ELEMENT_MSG =
            "CheckAlternativeOfDecorativeElement";
    public static final String CHECK_NATURE_AND_ALTERNATIVE_OF_ELEMENT_MSG =
            "CheckNatureAndAlternativeOfElement";
    public static final String CHECK_ELEMENT_WITH_NOT_EMPTY_ALT_MSG =
            "CheckNatureOfElementWithNotEmptyAltAttribute";
    public static final String CHECK_ELEMENT_WITH_EMPTY_ALT_MSG =
            "CheckNatureOfElementWithEmptyAltAttribute";
    public static final String NOT_PERTINENT_ALT_MSG = "NotPertinentAlt";
    public static final String CHECK_ALT_PERTINENCE_OF_INFORMATIVE_IMG_MSG =
            "CheckPertinenceOfAltAttributeOfInformativeImage";
    public static final String CHECK_NATURE_OF_IMAGE_WITH_NOT_PERTINENT_ALT_MSG = 
            "CheckNatureOfImageWithNotPertinentAlt";
    public static final String CHECK_NATURE_OF_IMAGE_AND_ALT_PERTINENCE_MSG = 
            "CheckNatureOfImageAndAltPertinence";
    public static final String CHECK_CAPTCHA_ALTERNATIVE_MSG =
            "CheckCaptchaAlternative";
    public static final String CHECK_CAPTCHA_ALTERNATIVE_ACCES_MSG =
            "CheckCaptchaAlternativeAccess";
    public static final String CHECK_NATURE_OF_IMAGE_AND_DETAILED_DESC_AVAILABILITY_MSG =
            "CheckNatureOfImageAndLongdescDefinition";
    public static final String CHECK_DETAILED_DESC_DEFINITION_OF_INFORMATIVE_IMG_MSG =
            "CheckLongdescDefinitionOfInformativeImage";
    public static final String CHECK_DESC_PERTINENCE_OF_INFORMATIVE_IMG_MSG = 
            "CheckDescriptionPertinenceOfInformativeImage";
    public static final String CHECK_NATURE_OF_IMAGE_AND_DESC_PERTINENCE_MSG = 
            "CheckNatureOfImageAndDescriptionPertinence";

    
    // frames 
    public static final String NOT_PERTINENT_TITLE_OF_FRAME_MSG = 
            "NotPertinentTitleOfFrame";
    public static final String NOT_PERTINENT_TITLE_OF_IFRAME_MSG = 
            "NotPertinentTitleOfIframe";
    public static final String CHECK_TITLE_OF_FRAME_PERTINENCE_MSG = 
            "CheckTitleOfFramePertinence";
    public static final String CHECK_TITLE_OF_IFRAME_PERTINENCE_MSG = 
            "CheckTitleOfIframePertinence";
    public static final String EMPTY_TITLE_OF_FRAME_MSG = "EmtpyTitleOfFrame";

    
    // form 
    public static final String NOT_PERTINENT_LEGEND_MSG = "NotPertinentLegend";
    public static final String CHECK_LEGEND_PERTINENCE_MSG = 
            "CheckLegendPertinence";
    public static final String OPTGROUP_WITHOUT_LABEL_MSG = 
            "OptgroupWithoutLabel";
    public static final String FIELDSET_WITHOUT_LEGEND_MSG = 
            "FieldsetWithoutLegend";
    public static final String CHECK_SELECT_ELEMENT_USAGE_MSG = 
            "CheckSelectUsage";
    public static final String CHECK_LABEL_PERTINENCE_MSG = 
            "CheckLabelPertinence";
    public static final String FORM_ELEMENT_WITHOUT_LABEL_MSG = 
            "FormElementWithoutLabel";
    public static final String CHECK_TITLE_OF_FORM_ELEMENT_MSG = 
            "CheckTitleOfFormElement";
    public static final String NOT_PERTINENT_OPTGROUP_LABEL_MSG = 
            "NotPertinentOptgroupLabel";
    public static final String CHECK_OPTGROUP_LABEL_PERTINENCE_MSG = 
            "CheckOptgroupLabelPertinence";
    public static final String FORM_ELEMENT_WITHOUT_IDENTIFIER_MSG = 
            "FormElementWithoutIdentifier";
    public static final String INVALID_FORM_FIELD_MSG = "InvalidFormField";
    public static final String INVALID_LABEL_MSG = "InvalidLabel";
    
    // link
    public static final String NOT_PERTINENT_LINK_TEXT_MSG = 
            "NotPertinentLinkText";
    public static final String CHECK_LINK_TEXT_PERTINENCE_MSG = 
            "CheckLinkTextPertinence";
    
    // table
    public static final String SUMMARY_MISSING_MSG = "SummaryMissing";
    public static final String CHECK_NATURE_OF_TABLE_WITH_EMPTY_SUMMARY_MSG =
            "CheckNatureOfTableWithEmptySummaryAttribute";
    public static final String CHECK_NATURE_OF_TABLE_WITH_NOT_EMPTY_SUMMARY_MSG =
            "CheckNatureOfTableWithNotEmptySummaryAttribute";
    public static final String CHECK_NATURE_OF_TABLE_WITH_SUMMARY_MSG =
            "CheckNatureOfTableWithSummaryAttribute";
    public static final String CHECK_NATURE_OF_TABLE_WITHOUT_SUMMARY_MSG = 
            "CheckNatureOfTableWithoutSummaryAttribute";
    public static final String CAPTION_MISSING_MSG = "CaptionMissing";
    public static final String CHECK_NATURE_OF_TABLE_WITHOUT_CAPTION_MSG = 
            "CheckNatureOfTableWithoutCaptionChildElement";
    public static final String CHECK_NATURE_OF_TABLE_WITH_CAPTION_MSG = 
            "CheckNatureOfTableWithCaptionChildElement";
    public static final String NOT_EMPTY_SUMMARY_MSG =
            "NotEmptySummaryForPresentationTable";
    public static final String NOT_PERTINENT_SUMMARY_MSG =
            "NotPertinentSummaryForDataTable";
    public static final String NOT_PERTINENT_CAPTION_MSG =
            "NotPertinentCaptionForDataTable";
    public static final String CHECK_SUMMARY_PERTINENCE_FOR_DATA_TABLE_MSG =
            "CheckSummaryPertinenceForDataTable";
    public static final String CHECK_CAPTION_PERTINENCE_FOR_DATA_TABLE_MSG =
            "CheckCaptionPertinenceForDataTable";
    public static final String CHECK_NATURE_OF_TABLE_FOR_NOT_PERTINENT_SUMMARY_MSG =
            "CheckNatureOfTableForNotPertinentSummary";
    public static final String CHECK_NATURE_OF_TABLE_FOR_NOT_PERTINENT_CAPTION_MSG =
            "CheckNatureOfTableForNotPertinentCaption";
    public static final String CHECK_NATURE_OF_TABLE_AND_SUMMARY_PERTINENCE_MSG =
            "CheckNatureOfTableAndSummaryPertinence";
    public static final String CHECK_NATURE_OF_TABLE_AND_CAPTION_PERTINENCE_MSG =
            "CheckNatureOfTableAndCaptionPertinence";
    public static final String CHECK_NATURE_OF_TABLE_AND_LINEARISED_CONTENT_MSG =
            "CheckNatureOfTableAndLinearisedContent";
    public static final String CHECK_USAGE_OF_HEADERS_FOR_DATA_TABLE_MSG =
            "CheckUsageOfHeaderForDataTable";
    public static final String CHECK_NATURE_OF_TABLE_AND_HEADERS_USAGE_MSG =
            "CheckNatureOfTableAndUsageOfHeaders";
    public static final String CHECK_DEFINITION_OF_HEADERS_FOR_DATA_TABLE_MSG=
            "CheckDefinitionOfHeaderForDataTable";
    public static final String CHECK_NATURE_OF_TABLE_AND_HEADERS_DEFINITION_MSG=
            "CheckNatureOfTableAndHeadersDefinition";
    public static final String CHECK_LINEARISED_CONTENT_MSG =
            "CheckLinearisedContent";
    public static final String PRESENTATION_TABLE_WITH_FORBIDDEN_MARKUP_MSG =
            "PresentationTableWithForbiddenMarkup";
    public static final String CHECK_TABLE_IS_DATA_TABLE_MSG =
            "CheckTableIsDataTable";
    public static final String CHECK_TABLE_IS_PRESENTATION_TABLE_MSG =
            "CheckTableIsPresentationTable";
    
    // mandatory elements 
    public static final String TITLE_TAG_MISSING_MSG = "TitleTagMissing";
    public static final String H1_TAG_MISSING_MSG = "H1TagMissing";
    public static final String LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG =
            "LangAttributeMissingOnHtml";
    public static final String LANG_ATTRIBUTE_MISSING_ON_WHOLE_PAGE_MSG =
            "LangAttributeMissingOnWholePage";
    public static final String WRONG_LANGUAGE_DECLARATION_MSG =
            "WrongLanguageDeclaration";
    public static final String SUSPECTED_RELEVANT_LANG_DECL_MSG =
            "SuspectedRelevantLanguageDeclaration";
    public static final String SUSPECTED_IRRELEVANT_LANG_DECL_MSG =
            "SuspectedIrrelevantLanguageDeclaration";
    public static final String IRRELEVANT_LANG_DECL_MSG =
            "IrrelevantLanguageDeclaration";
    public static final String UNDETECTED_LANG_MSG = "UndetectedLanguage";
    public static final String MALFORMED_LANGUAGE_DECLARATION_MSG =
            "MalformedLanguage";

    /**
     * Private constructor. This class handles keys and must not be instantiated
     */
    private RemarkMessageStore() {}
    
}