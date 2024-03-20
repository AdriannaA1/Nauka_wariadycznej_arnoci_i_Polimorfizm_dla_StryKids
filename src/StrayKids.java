
public class StrayKids {

    private String name;
    private String role;

    public StrayKids(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Stray Kids (" + name + ")";
    }
}

