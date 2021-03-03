package com.crowdlending.vo.experian

class ScoreVO {
    String bureauScore
    String bureauScoreConfidLevel

    ScoreVO(String bureauScore, String bureauScoreConfidLevel) {
        this.bureauScore = bureauScore.replace("\"", "")
        this.bureauScoreConfidLevel = bureauScoreConfidLevel.replace("\"", "")
    }
}
