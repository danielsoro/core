/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.projects.mock;

import java.util.Collections;

import org.jboss.forge.addon.projects.AbstractProjectType;
import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.addon.projects.ProjectType;
import org.jboss.forge.addon.ui.wizard.UIWizardStep;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class MockProjectTypeNoRequiredFacets extends AbstractProjectType
{
   @Override
   public String getType()
   {
      return "norequirements";
   }

   @Override
   public Class<? extends UIWizardStep> getSetupFlow()
   {
      return null;
   }

   @Override
   public Iterable<Class<? extends ProjectFacet>> getRequiredFacets()
   {
      return Collections.emptySet();
   }

   @Override
   public String toString()
   {
      return getType();
   }

   @Override
   public int priority()
   {
      return 0;
   }
}
