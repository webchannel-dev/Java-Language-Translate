/**
 * @Decsriptoin : Target of this apps is to get all filenames inside the inputed folder and subfolder into Spreadsheet   .
 * @author      : Ali Jamali ( MavajSunCo )
 * @Date        : 8-JUN-2011
 * @Email       : info@mavajsunco.com
 * @Website     : www.MavajSunCo.com
 **/
package com.msc.convert.exceptions;

public class NonexistentEntityException extends Exception {
    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public NonexistentEntityException(String message) {
        super(message);
    }
}
