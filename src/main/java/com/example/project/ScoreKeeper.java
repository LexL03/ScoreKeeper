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

public class ScoreKeeper {
    private int scoreA = 0;
	private int scoreB = 0;

    public void scoreTeamA1() {
        scoreA += 1;
    }

	public void scoreTeamA2(){
		scoreA += 2;
	}

	public void scoreTeamB3(){
		scoreB += 3;

	}

    public String getScore() {
        return String.format("%03d:%03d", scoreA, scoreB);
    }
}
