package edu.handong.csee.java.converters;
/**
* This interface convert value to other value
*/
public interface Convertible {
    /**This function accepts the number entered by user internally
     * @param fromValue The number entered by user
     */
    public void setFromValue(double fromValue);
    /**
     * This function return converted value
     */
    public double getConvertedValue();
    /**
     * This function converts number's unit
     */
    public void convert();

}
