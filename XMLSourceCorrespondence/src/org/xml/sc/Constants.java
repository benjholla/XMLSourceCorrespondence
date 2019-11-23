package org.xml.sc;

public class Constants {

	/** URI of the reserved "xmlns" prefix */
	public static final String XMLNS_URI = "http://www.w3.org/2000/xmlns/"; //$NON-NLS-1$

	/** The "xmlns" attribute name */
	public static final String XMLNS = "xmlns"; //$NON-NLS-1$

	/** The default prefix used for the {@link #XMLNS_URI} */
	public static final String XMLNS_PREFIX = "xmlns:"; //$NON-NLS-1$

	/** Qualified name of the xmlns android declaration element */
	public static final String XMLNS_ANDROID = "xmlns:android"; //$NON-NLS-1$

	/** The default prefix used for the {@link #ANDROID_URI} name space */
	public static final String ANDROID_NS_NAME = "android"; //$NON-NLS-1$

	/**
	 * The default prefix used for the {@link #ANDROID_URI} name space including the
	 * colon
	 */
	public static final String ANDROID_NS_NAME_PREFIX = "android:"; //$NON-NLS-1$

	/** The default prefix used for the app */
	public static final String APP_PREFIX = "app"; //$NON-NLS-1$

	/** The entity for the ampersand character */
	public static final String AMP_ENTITY = "&amp;"; //$NON-NLS-1$

	/** The entity for the quote character */
	public static final String QUOT_ENTITY = "&quot;"; //$NON-NLS-1$

	/** The entity for the apostrophe character */
	public static final String APOS_ENTITY = "&apos;"; //$NON-NLS-1$

	/** The entity for the less than character */
	public static final String LT_ENTITY = "&lt;"; //$NON-NLS-1$

	/** The entity for the greater than character */
	public static final String GT_ENTITY = "&gt;"; //$NON-NLS-1$

	public static final String XML_COMMENT_BEGIN = "<!--"; //$NON-NLS-1$

	public static final String XML_COMMENT_END = "-->"; //$NON-NLS-1$

	public static final String XML_PROLOG = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"; //$NON-NLS-1$

	/**
	 * Separator for xml namespace and localname
	 */
	public static final char NS_SEPARATOR = ':'; // $NON-NLS-1$

}
