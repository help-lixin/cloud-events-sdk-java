/*
 * Copyright 2018-Present The CloudEvents Authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.cloudevents.rw;

import io.cloudevents.SpecVersion;

@FunctionalInterface
public interface CloudEventWriterFactory<V extends CloudEventWriter<R>, R> {

    /**
     * Create a {@link CloudEventWriter} starting from the provided {@link SpecVersion}
     *
     * @param version the spec version to create the writer
     * @return the new writer
     * @throws CloudEventRWException if the spec version is invalid or the writer cannot be instantiated.
     */
    V create(SpecVersion version) throws CloudEventRWException;
}
