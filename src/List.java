public class List {

    public static void main(String[] args) {
        StrayKids[] members = {
                new StrayKids("Bang Chan", "Leader, Producer"),
                new StrayKids("Lee Know", "Dancer, Vocalist"),
                new StrayKids("Changbin", "Rapper, Dancer"),
                new StrayKids("Hyunjin", "Dancer, Vocalist"),
                new StrayKids("Han", "Rapper, Vocalist"),
                new StrayKids("Felix", "Dancer, Vocalist"),
                new StrayKids("I.N.", "Dancer, Vocalist"),
        };

        printMemberInfo(members);
        celebrateAnniversary(5);
    }

    private static void printMemberInfo(StrayKids[] members) {
        for (StrayKids member : members) {
            System.out.println("Imię: " + member.getName());
            System.out.println("Rola: " + member.getRole());
            System.out.println();
        }
    }

    private static void celebrateAnniversary(int years) {
        System.out.println("Gratulacje dla 7 idoli Stray Kids z okazji " + years + ". rocznicy!");
    }
}
