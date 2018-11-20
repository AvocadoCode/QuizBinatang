package com.idn.avocadocode.quizbinatang;

public class QuestionBank {

    private String textQuestions [] = {
            "Kadal Terbesar di dunia",
            "Badak cula satu  terdapat di…",
            "Kura-kura terbesar adalah…",
            "Hewan Qurban, Menggembalanya adalah pekerjaan para Nabi",
            "Boleh dipelihara untuk berburu dan menjaga ternak"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Iguana", "Cicak", "Buaya", "Komodo"},
            {"Afrika Selatan", "Afrika Utara", "Kalimantan", "Ujung Kulon"},
            {"Galapagos", "Kura-kura air Brazil", "Kura-kura Ambon", "Bosjavanicus"},
            {"Kurma", "Ayam", "Sapi", "Kambing"},
            {"orang utan", "Macan Kumbang", "Musang", "Anjing"}
    };

    private String mCorrectAnswers[] = {"Komodo", "Ujung Kulon", "Galapagos", "Kambing", "Anjing"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}