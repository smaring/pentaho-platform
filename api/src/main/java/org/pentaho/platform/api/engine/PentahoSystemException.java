/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/


package org.pentaho.platform.api.engine;

import org.pentaho.platform.api.util.PentahoCheckedChainedException;

/**
 * 
 * @author Steven Barkdull
 * 
 */
public class PentahoSystemException extends PentahoCheckedChainedException {

  /**
   * 
   */
  private static final long serialVersionUID = 666L;

  public PentahoSystemException() {
    super();
  }

  public PentahoSystemException( final String message, final Throwable reas ) {
    super( message, reas );
  }

  public PentahoSystemException( final String message ) {
    super( message );
  }

  public PentahoSystemException( final Throwable reas ) {
    super( reas );
  }

}
