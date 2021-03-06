/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.templates.freemarker;

import org.jboss.forge.addon.resource.Resource;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
class ResourceId
{
   private final Resource<?> resource;
   private final String id;

   public ResourceId(Resource<?> resource)
   {
      super();
      this.id = resource.getName().toString();
      this.resource = resource;
   }

   public String getId()
   {
      return id;
   }

   public Resource<?> getResource()
   {
      return resource;
   }
}