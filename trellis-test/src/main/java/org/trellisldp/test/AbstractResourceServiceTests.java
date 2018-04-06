/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trellisldp.test;

import org.trellisldp.api.ResourceService;
import org.trellisldp.api.Session;

/**
 * A convenience class for running the ResourceService tests.
 */
public abstract class AbstractResourceServiceTests implements ResourceServiceTests {

    /**
     * Get the ResourceService.
     * @return the resource service
     */
    public abstract ResourceService getResourceService();

    /**
     * Get the session context.
     * @return the session context
     */
    public abstract Session getSession();
}