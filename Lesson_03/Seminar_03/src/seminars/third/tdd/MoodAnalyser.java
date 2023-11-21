package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {

        if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("good")) {
            return "happy";
        }
        if (message.toLowerCase().contains("bad") || message.toLowerCase().contains("sad")) {
            return "unhappy";
        }
        return "normal";

    }

}