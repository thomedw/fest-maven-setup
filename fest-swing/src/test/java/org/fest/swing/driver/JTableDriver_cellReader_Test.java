/*
 * Created on Feb 25, 2008
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
 * Copyright @2008-2010 the original author or authors.
 */
package org.fest.swing.driver;

import static org.fest.swing.test.core.Mocks.mockRobot;

import org.fest.swing.test.core.EDTSafeTestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link JTableDriver#cellReader(org.fest.swing.cell.JTableCellReader)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class JTableDriver_cellReader_Test extends EDTSafeTestCase {

  private JTableDriver driver;

  @Before
  public void setUp() {
    driver = new JTableDriver(mockRobot());
  }

  @Test(expected = NullPointerException.class)
  public void should_throw_error_if_cellReader_is_null() {
    driver.cellReader(null);
  }
}
