/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.projects.spi;

import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.resource.DirectoryResource;
import org.jboss.forge.furnace.services.Exported;

/**
 * Responsible for caching {@link Project} instances so that they do not need to be re-built or re-generated for
 * multiple consumers.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
@Exported
public interface ProjectCache
{
   /**
    * Retrieve a {@link Project} from the cache, using {@link Project#getProjectRoot()} as the key.
    */
   Project get(DirectoryResource target);

   /**
    * Invalidate the cache, forcing all stored projects to be re-built.
    */
   void invalidate();

   /**
    * Store the given {@link Project} into this cache.
    */
   void store(Project project);
}
