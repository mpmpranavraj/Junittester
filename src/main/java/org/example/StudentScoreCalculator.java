package org.example;

public class StudentScoreCalculator {
    private int satScore;

    public void calcsat(int mathScore , int literacyScore) {
        if (mathScore < 0 || mathScore > 100 || literacyScore < 0 || literacyScore > 100) {
            satScore = -1;

        } else {
            satScore = mathScore * literacyScore;
        }
    }
        public int GetSatScore(){
            return this.satScore;

        }


    }

