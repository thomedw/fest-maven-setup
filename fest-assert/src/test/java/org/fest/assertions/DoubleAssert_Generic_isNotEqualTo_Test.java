/*
 * Created on 2010-4-26
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2007-2010 the original author or authors.
 */

package org.fest.assertions;

/**
 * Test ensuring that {@link DoubleAssert} obeys the {@link GenericAssert#isNotEqualTo(Object)} contract
 * for {@link Double}.
 */
public class DoubleAssert_Generic_isNotEqualTo_Test extends GenericAssert_isNotEqualTo_TestBase<Double> {

  @Override
  protected Double createActualValueEight() {
    return 8.0d;
  }

  @Override
  protected Double createActualValueZero() {
    return 0.0d;
  }

  @Override
  protected DoubleAssert createAssertionForActualValue(Double actual) {
    return new DoubleAssert(actual);
  }

  @Override
  protected String messageStringRepresentingEight() {
    return "8.0";
  }

}
