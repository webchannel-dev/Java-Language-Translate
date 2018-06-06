/**
 * @Decsriptoin : Target of this apps is to get all filenames inside the inputed folder and subfolder into Spreadsheet   .
 * @author      : MavajSunCo
 * @Date        : 8-JUN-2011
 * @Email       : info@mavajsunco.com
 * @Website     : www.MavajSunCo.com
 **/
package com.msc.convert.exceptions;

public class PreexistingEntityException extends Exception {
    public PreexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException(String message) {
        super(message);
    }
}
