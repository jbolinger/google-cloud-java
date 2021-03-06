/*
 * Copyright 2015 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datastore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RawValueTest {

  private static final com.google.datastore.v1.Value CONTENT = StringValue.of("hello").toPb();

  @Test
  public void testToBuilder() throws Exception {
    RawValue value = RawValue.of(CONTENT);
    assertEquals(value, value.toBuilder().build());
  }

  @Test
  public void testOf() throws Exception {
    RawValue value = RawValue.of(CONTENT);
    assertEquals(CONTENT, value.get());
    assertFalse(value.excludeFromIndexes());
  }

  @SuppressWarnings("deprecation")
  @Test
  public void testBuilder() throws Exception {
    RawValue.Builder builder = RawValue.newBuilder(CONTENT);
    RawValue value = builder.setMeaning(1).setExcludeFromIndexes(true).build();
    assertEquals(CONTENT, value.get());
    assertEquals(1, value.getMeaning());
    assertTrue(value.excludeFromIndexes());
  }
}
