/**
 * **************************************************************************
 *                          NOTICE
 * This software was produced for the U. S. Government under Contract No.
 * W15P7T-12-C-F600, and is subject to the Rights in Noncommercial Computer
 * Software and Noncommercial Computer Software Documentation Clause
 * 252.227-7014 (JUN 1995)
 *
 * (c) 2012 The MITRE Corporation. All Rights Reserved.
 * **************************************************************************
 */
package org.mitre.opensextant.data;

/**
 *
 * @author Marc C. Ubaldino, MITRE <ubaldino at mitre dot org>
 */
public class Place extends GeoBase {

    /** For normalization purposes tracking the Province may be helpful.
     * Coordinate and Place both share this common field.  However no need to 
     * create an intermediate parent-class yet.
     */
    public String province_id = null;
    
    /** If you can retrieve the Province by ID, attach it here for future reference.
     */
    public Place province = null;

    /**
     *
     */
    public PlaceName placeName= null;

    /**
     * Creates a new instance of Geobase
     * @param pk 
     * @param n 
     */
    public Place(String pk, String n) {
        super(pk, n);
    }
}