public class Main {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList( "Red", "Blue", "Green" );

         Predicate<String> predicate = s -> s.length() > 4;
         
         List<String> filteredList = namesList.stream().filter(predicate).collect(Collectors.toList());
    }
}
