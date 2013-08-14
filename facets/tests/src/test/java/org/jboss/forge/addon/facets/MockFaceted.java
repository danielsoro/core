/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.facets;

import org.jboss.forge.addon.facets.AbstractFaceted;

public class MockFaceted extends AbstractFaceted<MockFacet>
{

   @Override
   public <F extends MockFacet> boolean supports(F facet)
   {
      return true;
   }

}