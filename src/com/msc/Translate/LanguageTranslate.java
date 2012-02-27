/**
 * @Decsriptoin : Target of this apps is to get all filenames inside the inputed folder and subfolder into Spreadsheet   .
 * @author      : Ali Jamali ( MavajSunCo )
 * @Date        : 8-JUN-2011
 * @Email       : info@mavajsunco.com
 * @Website     : www.MavajSunCo.com
 **/
package com.msc.Translate;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class LanguageTranslate {

    public String Translate(String input) throws Exception {
        Translate.setHttpReferrer("www.MavajSunCo.com");
        Translate.setKey("ABQIAAAA_E354iNBarK3Bnnp9-neoRTYwfih2J8vHKxZ1Etpq0icsCnyphRPve0_PHrfG5PAfXGkj5wuNyGxvg");
        return Translate.execute(input, Language.ENGLISH, Language.ARABIC);
    }
}