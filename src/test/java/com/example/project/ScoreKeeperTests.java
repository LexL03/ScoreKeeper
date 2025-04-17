/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScoreKeeperTests {

	@Test
    public void testInitialScore() {
        ScoreKeeper sk = new ScoreKeeper();
        assertEquals("000:000", sk.getScore());
}

@Test
public void testScoreTeamA1() {
    ScoreKeeper sk = new ScoreKeeper();
    sk.scoreTeamA1();
    assertEquals("001:000", sk.getScore());
}

@Test
public void testScoreTeamB3() {
    ScoreKeeper sk = new ScoreKeeper();
    sk.scoreTeamB3();
    assertEquals("000:003", sk.getScore());
}

@Test
public void testScoreTeamA2() {
    ScoreKeeper sk = new ScoreKeeper();
    sk.scoreTeamA2();
    assertEquals("002:000", sk.getScore());
}

@Test
public void testScoreTeamA3() {
    ScoreKeeper sk = new ScoreKeeper();
    sk.scoreTeamA3();
    assertEquals("003:000", sk.getScore());
}


}
