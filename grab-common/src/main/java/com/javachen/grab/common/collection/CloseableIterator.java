/*
 * Copyright (c) 2014, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.javachen.grab.common.collection;

import java.io.Closeable;
import java.util.Iterator;

/**
 * Implementations are {@link java.util.Iterator}s that are also {@link java.io.Closeable}.
 */
public interface CloseableIterator<T> extends Iterator<T>, Closeable {
    // Adds nothing
}
