class ArrayExample {

    public static void main(String[] args) {
        String[] names = {"Bosch", "Robert", "Alen"};
        char characterToCheck='B';
        printNamesStartingWithB(names,characterToCheck);  
    }
    
    public static void printNamesStartingWithB(String[] names,char characterToCheck) {
        for (String name : names) {
            if (name.startsWith(String.valueOf(characterToCheck))) {
                System.out.println(name);
            }
        }
    }
}
