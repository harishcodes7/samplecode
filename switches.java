public class switches {
    public static void main(String[] args) {
        String day = "thu";
        String result="";
        result = switch(day)
        {
            case "sat", "sun" -> "6am";
            case "monday" -> "8am";
            default -> "7am";
        };
        System.out.println(result);

    }
}
